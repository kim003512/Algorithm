package dp;

import java.util.*;

public class algo_1890_dp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int count = 0;
//		
//		int game[][] = new int[N+1][N+1];
//		
//		for(int i=1; i<=N; i++) {
//			for(int j=1; j<=N; j++) {
//				game[i][j] = sc.nextInt();
//			}
//		}
//		
//		int start = game[1][1];
//		
//		while(start == game[N+1][N+1]) {
//			
//		}
//		
//		sc.close();
		int[][] map = new int[101][101];
	    long[][] dp = new long[101][101]; //경로의 개수는 263-1보다 작거나 같다. => long 사용
	    int n = sc.nextInt();
	 
	    dp[0][0] = 1; //기본값 설정
	 
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            map[i][j] = sc.nextInt();
	        }
	    }
	 
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	        	//거르는 경우 : dp[i][j] == 0 , 마지막 도착지점인 경우
	            if (dp[i][j] == 0 || (i == n - 1 && j == n - 1)) {
	                continue;
	            }
	 
	            int dist = map[i][j];
	            int down = dist + i;
	            int right = dist + j;
	 
	            if (down < n) { //칸수보다는 작아야 칸 안에서 돌 수 있기 때문에
	                dp[down][j] += dp[i][j];
	            }
	 
	            if (right < n) {
	                dp[i][right] += dp[i][j];
	            }
	        }
	    }
	    //dp..출력..
	    System.out.println(dp[n - 1][n - 1]);
	}
}
