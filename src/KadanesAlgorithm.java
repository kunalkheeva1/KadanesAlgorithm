public class KadanesAlgorithm {

    public static int maximumSumSubArray(int [] arr, int n){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += arr[i];
            max = Math.max(max, sum);

            if(sum <0){
                sum = 0;
            }
        }return max;
    }


    public static void main(String[] args) {

    }
}
