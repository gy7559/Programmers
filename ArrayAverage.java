package com.study;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		
		Average average = new Average(a);
		
		average.solution();
		System.out.println(average.answer);
	}

}
class Average {
	int[] numbers;
	double answer = 0;
    public double solution() {
        
        double sum = 0;
        
        for(int i = 0; i < numbers.length; i++){
            sum= sum + numbers[i];
            
        }
        answer = sum/numbers.length;
        return answer;
    }
    public Average(int[] a) {
    	this.numbers = a ;
    }
    
}