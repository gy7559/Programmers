package com.study;

public class Bacterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bacteri  ba = new Bacteri();
		int n =2;
		int t =10;
		System.out.println(ba.solution(n,t));
	}

}
class Bacteri {
    public int solution(int n, int t) {
        int answer = n;
        for(int a = 0; a<t;a++){
            answer = answer*2;
        }
        return answer;
    }
}