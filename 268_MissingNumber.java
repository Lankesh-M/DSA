class Solution {
    public int missingNumber(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
         }
         if(nums[0] != 0){return 0;}
         int n = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] - 1 != nums[i-1]){
                n = nums[i] - 1;
                break;
            }
            n = nums[i] + 1;
        }
        return n;
    }
}
