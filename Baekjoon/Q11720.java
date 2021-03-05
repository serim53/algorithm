package Baekjoon;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String str = sc.next();
		
		int sum = 0;
		
		
		sc.close();
		
		for(int i=0;i<N;i++) {
			
			// string으로 받아온 것을 int로 변환하기 위해 아스키코드를 이용한다.
			// 단, 변환시 '0'을 빼주거나 48을 빼주어야한다.
			
			sum += str.charAt(i)-'0';
			
		}
		
		System.out.println(sum);
	}
}
