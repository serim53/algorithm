package Baekjoon;

import java.util.Scanner;

// 2*dp(n-1)-1

public class Q10844 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long dp[] = new long[N];

		if(N == 1) {
			dp[0] = 9;
		}
		else {
			dp[0] = 9;
			for (int i=1; i<N; i++) {
				dp[i] = 2*dp[i-1]-1;
			}
		}
		
		System.out.println(dp[N-1]);
	}

}
