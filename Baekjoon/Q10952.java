package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
public class Q10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0&&b==0) {
				
				sc.close();
				break;
			}
			System.out.println(a+b);
			
		} 
	}

}

*/


// 위 방법은 실행시간이 오래걸림


public class Q10952 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			// 문자열로 입력받고 공백을 이용하여 분리
			st = new StringTokenizer(br.readLine()," ");
			
			// 문자열 형태로 입력받은 것을 integer로 변형
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) { break; }
			
			sb.append((a+b)).append('\n');
			
			
		
		}
		
		System.out.println(sb);
		
		
		
	}
	
}



