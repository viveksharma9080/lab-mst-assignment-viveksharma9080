class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the leftmost index where target appears
        result[0] = findFirstOccurrence(nums, target);
        if (result[0] == -1) {
            // If target is not found, return [-1, -1]
            return result;
        }
        
        // Find the rightmost index where target appears
        result[1] = findLastOccurrence(nums, target);
        
        return result;
    }
    
    // Helper function to find the first occurrence of target
    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstOccurrence = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    firstOccurrence = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return firstOccurrence;
    }
    
    // Helper function to find the last occurrence of target
    private int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lastOccurrence = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    lastOccurrence = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return lastOccurrence;
    }
}
