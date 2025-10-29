Two Sum II - Input Array Is Sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Return 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;   // move right to get a larger sum
            } else {
                right--;  // move left to get a smaller sum
            }
        }
        return new int[]{-1, -1}; // shouldn't happen as per problem constraints
    }
}
