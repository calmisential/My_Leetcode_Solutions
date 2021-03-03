package from_1_to_200.P70_爬楼梯;


class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if (n == 1 || n == 2){
            return n;
        }
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
