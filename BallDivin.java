package com.study;

public class BallDivin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balls  b = new Balls();
		
		System.out.println(b.solution(5, 2));
	}

}
class Balls{
    public int solution(int balls, int share) {

       return combination(balls, share);
    }
    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }

}