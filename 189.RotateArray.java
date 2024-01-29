class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        for(int i = nums.length-k; i < nums.length; i++){
            temp[i - nums.length+k] = nums[i];
        }

         for (int i = nums.length - k - 1; i >= 0; i--)
              nums[i + k] = nums[i];
    

        for(int j = 0; j < k; j++)
            nums[j] = temp[j];

    }
}
