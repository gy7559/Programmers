package com.study;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10,8,6};
		int d = 3;
		DiceRoll dice = new DiceRoll(x,d);
		
		dice.solution();
		
		System.out.println(dice.answer);
	}

}
class DiceRoll {
	int[] box;
	int n;
	int answer=0;
    public int solution() {
        answer = (box[0]/n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
    
    
    public DiceRoll(int[] q,int d) {
    	this.box = q;
    	this.n = d;
    }
}