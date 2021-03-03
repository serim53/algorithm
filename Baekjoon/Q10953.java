package Baekjoon;

import java.util.Scanner;

public class Q10953 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<T;i++) {
			
			String str = sc.nextLine();
			
			String[] arr = str.split(",");
			System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
		}
		
	}
}
