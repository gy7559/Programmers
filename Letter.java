package com.study;


public class Letter {

	public static void main(String[] args) {
		Let le = new Let();
		System.out.println(le.solution("happy birthday!"));

	}

}
class Let {
    public int solution(String message) {
        int answer = message.length()*2;  
        return answer;
    }
}