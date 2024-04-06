public class MaxDivScore {
    public static int maxDivScore(int[] nums, int[] divisors) {
        int out = Integer.MIN_VALUE;
        int index = 0;

        for (int i=0; i<divisors.length; i++){
            int max = 0;
            int j = 0;
            for (j=0; j<nums.length; j++){
                if (nums[j]%divisors[i] == 0){
                    max++;
                }
            }
            if (max > out){
                index = divisors[i];
                out = max;
            }else if (out == max){
                index = Math.min(index,divisors[i]);
                out = max;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {12};
        int[] div = {10,16};
        System.out.println(maxDivScore(nums,div));
    }
}
