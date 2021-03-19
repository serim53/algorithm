package Baekjoon;

import java.util.Scanner;

// 이친수
// 첫 번째 자리수는 무조건 1
// 1이 두 번 연속으로 나타나지 않음 -> 두 번째 자리수는 무조건 0
// 직접 구해보면  1-1, 2-1, 3-2, 4-3, 5-5, 6-8 (피보나치 규칙)

public class Q2193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		// int로 배열 선언시 정수의 범위를 초과하기 때문에 X
		long dp[] = new long[N];

		if(N == 1) {
			dp[0] = 1;
		}
		else if(N == 2) {
			dp[1] = 1;
		}
		else {
			dp[0] = 1;
			dp[1] = 1;
			for (int i=2; i<N; i++) {
				dp[i] = dp[i-1] + dp[i-2];
			}
		}
		
		System.out.println(dp[N-1]);
		
	}

}
