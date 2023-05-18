package com.study;

public class Code {

	public static void main(String[] args) {
		String s = "dfjardstddetckdaccccdegk";
		int t = 4;
		Decryption a = new Decryption(s,t);
		
		a.solution();
		System.out.println(a.answer);
	}

}


class Decryption {
	String cipher;
	int code;
	String answer = "";
    public String solution() {
        for(int a = 1; a <= cipher.length()/code;a++){
            answer= answer + cipher.charAt(a*code-1);
        }
        return answer;
    }
    public Decryption(String s, int c) {
    	this.cipher = s;
    	this.code = c;
    }
}