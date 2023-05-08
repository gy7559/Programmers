package com.study;

import java.util.Arrays;

public class ArrayRevers {

	public static void main(String[] args) {
		int[] num_list = {1,5,4,8,7,5};
		 int[] answer = new int[num_list.length];
	        
	        int x = 0;
	        
	        for(int i =num_list.length-1; i >=0; i-- ){
	            answer[x] =  num_list[i];
	            x++;
	        }
	        System.out.println(Arrays.toString(answer));
	}

}
