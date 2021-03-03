package Baekjoon;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 입력의 끝을 EOF로 판단할 수 있는 부분 필요
		// hasNext, hasNextInt, hasNextLong 등으로 더 이상 입력이 없다는 것을 판단할 수 있도록 함
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
	}

}
