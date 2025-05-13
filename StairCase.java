public class StairCase {
    public static void main(String[] args) {
        int stairs = 4;
        System.out.println(CountStairs(stairs));
    }

     private static int CountStairs(int stairs) {
        int[] dp = new int[stairs+1];
        dp[0] = 1;
        dp[1] = 1;
         for(int i = 2; i < stairs+1; i++) {
             dp[i] = dp[i-1] + dp[i-2];
         }
         return dp[dp.length-1];
    }
}
