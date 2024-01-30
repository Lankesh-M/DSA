class Solution {
    public void moveZeroes(int[] nums) {
        int non_zero = 0;
        for(int i=0; i<nums.length ;i++){
            if(nums[i] != 0)
                nums[non_zero++] = nums[i];   
        }

        for(int i = non_zero; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}
