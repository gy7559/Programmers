package com.study;

public class CutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class CA {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1 + 1];
        int i = 0;
       for(int x = num1; x<=num2; x++){
          answer[i] = numbers[x];
           i++;
        }
        
        return answer;
    }
}