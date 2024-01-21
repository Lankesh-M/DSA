class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        low = 0
        high = len(nums) - 1
        squared_array = []
        while(low <= high):
            if abs(nums[low]) >= abs(nums[high]) :
                squared_array.append(abs(nums[low])**2)
                low += 1
            else:
                squared_array.append(abs(nums[high])**2)
                high -= 1
        return squared_array[::-1]
