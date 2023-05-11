package com.study;
import java.util.Arrays;

public class MaxMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};
		Mult mm = new Mult(numbers);
		
		mm.solution();
		System.out.println(mm.answer);	
	}

}
class Mult {
	int[] numbers;
	 int answer = 0;
    public int solution() {
       
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
    public Mult(int[] n) {
    	this.numbers = n;
    }
    
}