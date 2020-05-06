package dp;

import java.util.*;

//https://www.acmicpc.net/problem/2293
public class algo_2293_dp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt(), coin;
		int[] dp = new int[k+1];
		
		dp[0] = 1;
		
		for(int i = 0; i<n; i++) {
			coin = sc.nextInt();
			for(int j = 1; j < k+1; j++) {
				if(j >= coin)
					dp[j] += dp[j-coin];
				}
		}
		System.out.println(dp[k]);
	}
}
