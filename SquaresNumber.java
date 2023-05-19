package com.study;

public class SquaresNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 144;
		Squar sq = new Squar();
		System.out.println(sq.solution(n));
	}

}
class Squar {
    public int solution(int n) {
        int answer = 0;
        for(int a = 1; a<n ; a++){
            if(n/a==a&&n%a==0){
                answer = 1;
                break;
            }else{
                answer = 2;
            }
        }
        return answer;
    }
}