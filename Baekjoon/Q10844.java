package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844 {
	
	final static long mod = 1000000000;

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[N+1][10];
		
		for(int i=1; i<10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) {
			
			for(int j=0; j<10; j++) {
				
				// 자리값이 0일 경우 그 전 자리값은 1만 가능함
				if(j == 0) {
					dp[i][0] = dp[i-1][1] % mod;
				}
				// 자리값이 9일 경우 그 전 자리값은 8만 가능함
				else if(j == 9) {
					dp[i][9] = dp[i-1][8] % mod;
				}
				// 자리값이 1과 9가 아닌 그 외의 것들에 대한 앞자리값 구하기
				// ex) 자리값이 8일 경우 그 전 자리값은 7과 9가 올 수 있음
				// j -> j-1, j+1
				else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
				}
			}
		}
		
		long result = 0;
		
		// 각 자리값마다의 경우의 수를 모두 더해준다
		for(int i=0; i<10; i++) {
			result += dp[N][i];
		}
		
		System.out.println(result % mod);
	}

}
