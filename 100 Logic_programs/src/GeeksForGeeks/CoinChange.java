package GeeksForGeeks;


public class CoinChange {
    public static int countWays(int coins[], int N, int sum) {
        int dp[] = new int[sum + 1];
                dp[0] = 1;
        for (int i = 0; i < N; i++) {
            int coin = coins[i]; //{1,2,3}
            System.out.println("coin......= "+coin);
            for (int j = coin; j <= sum; j++) {
            	System.out.println("j....= "+j);
              System.out.println(dp[j] += dp[j - coin]);
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int N = 3; 
        int sum = 4; 
        int coins[] = {1,2,3};

        int numberOfWays = countWays(coins, N, sum);
        System.out.println("Number of ways to get sum " + sum + " is " + numberOfWays);
    }
}
