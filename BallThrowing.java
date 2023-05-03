package com.study;

public class BallThrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5};
		
		Ball ball = new Ball(numbers,6);
		ball.solution();
		
		System.out.println(ball.answer);
	}

}
class Ball {
	 int z=1;
     int answer = 0;
     int[] numbers;
     int k;
    public int solution() {
        
        for(int a=0; a<k-1;a++){
             z=z+2;
            if(z>numbers.length){
                z=z-numbers.length;
            }
        }
        answer=z;
        return answer;
    }
    public Ball( int[] n, int a) {
    	this.numbers = n;
    	this.k = a;
    }
    
}