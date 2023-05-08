package com.study;

public class Americano {

	public static void main(String[] args) {
		int m = 50000;
		Fun am = new Fun(m);
		
		am.solution();
		System.out.println(am.answer);
	}

}
class Fun {
	int money;
	int[] answer = {0,0};
    public int[] solution() {
        
        
        answer[0]= money/5500;
        answer[1]= money%5500;
        return answer;
    }
    public Fun(int m) {
    	this.money = m;
    }
}