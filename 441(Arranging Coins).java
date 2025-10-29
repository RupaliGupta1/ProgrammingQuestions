441. Arranging Coins
  class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n; // use long to avoid overflow
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = mid * (mid + 1) / 2;
            
            if (coins == n) {
                return (int) mid;
            } else if (coins < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) right;
    }
}
