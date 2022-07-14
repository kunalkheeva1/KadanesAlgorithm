public class KadanesAlgorithm {

    // kadanes algorithm to calculate the max sum containing in a subarrary
    public static int maximumSumSubArray(int [] arr, int n){

        // initially sum is zero and the comparitive value is minimum
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            // sum is as usual and stored in max if its more than max
            sum += arr[i];
            max = Math.max(max, sum);
            // but at any time if its less then 0 then we make it 0 and continue
            if(sum <0){
                sum = 0;
            }
        }return max;
    }


    public static void main(String[] args) {

    }
}
