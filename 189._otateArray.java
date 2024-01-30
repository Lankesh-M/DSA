//Brute Force
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
//Optimal Solution
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
