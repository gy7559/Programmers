package com.study;

public class Protractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 120;
		Pro pr = new Pro(s);
		
		pr.solution();
		
		System.out.println(pr.answer);
	}

}
class Pro{
	int answer = 0;
	int angle;
    public int solution() {
        int result = 0;
        if(angle>0&&angle<90){
            result = 1;
        }else if(angle==90){
            result = 2;
        }else if(angle>90&&angle<180){
            result = 3;
        }else if(angle==180){
            result = 4;
        }
        answer = result;
        return answer;
    }
    public Pro(int s) {
    	this.angle =s;
    }
}