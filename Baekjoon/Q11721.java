package Baekjoon;

import java.util.Scanner;

public class Q11721 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			if(i%10==9)
				System.out.println();
		}
	}

}
