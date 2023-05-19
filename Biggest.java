package com.study;

import java.util.Arrays;

public class Biggest {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		Big bi = new Big();
		System.out.println(Arrays.toString(bi.solution(array)));
		

	}

}
class Big {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        for(int a=0;a<array.length;a++){
            if(answer[0]<array[a]){
                answer[0]=array[a];
                answer[1]= a;
            }
        }
        
        return answer;
    }
}