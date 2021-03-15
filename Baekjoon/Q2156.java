package Baekjoon;

import java.util.Scanner;

public class Q2156 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 각 포도주의 양 저장하는 배열
		int[] arr = new int[n+1];
		// 먹는 포도주를 저장하는 배열
		int[] dp = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[1] = arr[1];
		
		if(n>1)	// <- *(?) 없으면 런타임에러가 나왔음
			dp[2] = dp[1] + arr[2];
		
		for(int i=3; i<=n; i++) {
			dp[i] = Math.max(
					dp[i-1], // 포도주를 두 번 연속 먹지 않았을 경우
					Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]) // 마지막 잔을 마셨을 경우
					);
		}
		
		System.out.println(dp[n]);
	}

}
