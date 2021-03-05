package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11719 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			
			String input = sc.nextLine();
			
			if(input == null)
				break;
			
			list.add(input);
			
		}
		
		sc.close();
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}
