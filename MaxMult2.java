package com.study;

import java.util.Arrays;

public class MaxMult2 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, -3, -4, 5};
		Mult2 mm = new Mult2(numbers);
		
		mm.solution();
		System.out.println(mm.answer);	
	}

}

class Mult2 {
	int[] numbers;
	int answer = 0;
    public int solution() {
        
        Arrays.sort(numbers);
        int res1 = numbers[0] * numbers[1];
        int res2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if (res1 >= res2){
            answer = res1;
        }else{
            answer = res2;
        }
            
        return answer;
    }
    public Mult2(int[] n) {
    	this.numbers= n;
    }
}