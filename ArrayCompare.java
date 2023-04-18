package com.study;

public class ArrayCompare {
	//배열안의 중복 숫자 찾기
	 public int solution(int[] array, int n) {
	        int answer = 0;
	     
	        for (int i= 0; i < array.length; i ++){
	            if(n == array[i]){
	                answer = answer+1;
	            }
	        }
	        
	        return answer;
	    }
}
