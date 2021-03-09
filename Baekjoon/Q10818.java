package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] num = new int[N];
		
		for(int i=0; i<N; i++)
			num[i] = sc.nextInt();
		
		sc.close();
		
		Arrays.sort(num);
		
		System.out.print(num[0] + " " + num[N-1]);

	}

}
