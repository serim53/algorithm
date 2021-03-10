package Baekjoon;

import java.util.Scanner;

public class Q1463 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int num = 0;
		
		while(X!=1) {
			
			if(X%3==0) {
				X = X/3;
				num++;
			}
			else if(X%2==0) {
				X = X/2;
				num++;
			}
			else {
				X = X-1;
				num++;
			}
		}
		
		System.out.print(num);
		
		
	}

}
