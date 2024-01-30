class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_repeated_one = 0;
        int ones=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                ones += 1;
            else{
                if(ones > max_repeated_one){
                    max_repeated_one = ones;
                }
                ones = 0;
            }

        }
        return max_repeated_one < ones ? ones : max_repeated_one;
    }
}
