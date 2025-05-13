public class CoinDenominations {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(Cal(coins,amount));
    }
    static int Cal(int[] coins,int amount){
        int[] dp = new int[amount+1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE; 
        }
        dp[0] = 1;
        for(int coin : coins){
            for(int i=coin;i<amount+1;i++){
                if(dp[i - coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coin]+1);
            }
        }
    return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
