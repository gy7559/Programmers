package com.study;

public class CutPaper {
	public static void main(String[] args) {
		Cut1 cu = new Cut1();
		int M = 2;
		int N = 5;
		System.out.println(cu.solution(M,N));
	}
}
class Cut1 {
    public int solution(int M, int N) {
        int answer = M*N-1;
        return answer;
    }
}