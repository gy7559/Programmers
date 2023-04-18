package com.study;

public class ArrayIf {

	    public int solution(int[] array, int height) {
	        int answer = 0;
	        for(int i = 0;  i < array.length; i++){
	            if (height < array[i]){
	                answer = answer +1;
	            }
	        }
	        return answer;
	    }

}
