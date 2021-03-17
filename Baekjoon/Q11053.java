package Baekjoon;

import java.util.Scanner;

public class Q11053 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int dp[] = new int[n];
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++){
        	
            a[i] = sc.nextInt();
            
            dp[i] = 1;
            
            for (int j = 0; j < i; j++){
            	
                if (a[j] < a[i] && dp[i] < dp[j] + 1) {
                	
                	dp[i] = dp[j]+1;
                	
                }
            }
        }
        
        int max = 0;
        
        for (int i = 0; i < n; i++){
        	
            if (dp[i] > max){
                max = dp[i];
            }
            
        }
        
        System.out.println(max);
    }
	
}
