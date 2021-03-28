package Baekjoon;

import java.util.Scanner;

public class Q2805 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long m = sc.nextLong();
		
		long[] arr = new long[n];
		
		long max = 0;
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextLong();
			max = Math.max(max, arr[i]);
		}
		
		long left = 1;
		long right = max;
		
		long height = 0;
		
        while(left <= right){

            height = 0;
            long mid =(left+right)/2;

            for (int i = 0; i < n; i++) {
            	
                if(arr[i] >= mid) {
                	
                    height += (arr[i] - mid);
                    
                }
            }
            
            if (height >= m) {
            	
            	left = mid + 1;
            	
            } else {
            	
                right = mid-1;
                
            }
        }
        
        System.out.println(right);
		
	}

}
