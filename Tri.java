package com.study;
import java.util.Scanner;
public class Tri {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	         String answer = "";
	        for(int i = 1; i <= n; i++){
	            for(int j = 0; j<i;j++){
	                answer += "*";
	            }
	            answer += "\n";
	        }
	        
	        System.out.println(answer);
	    }
	}



