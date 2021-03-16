package Baekjoon;

import java.util.Scanner;

public class Q11053 {

	// 수정필요
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		// 현재 수(큰 수 발생시 변함)
		int now = 0;
		// 수열 안 원소의 개수
		int count = 0;
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			
			if(A[i]>=now) {
				count++;
				now=A[i];
			}
		}
		
		System.out.println(count);
		
	}
	

}
