package com.study;

public class NextNum {

	public static void main(String[] args) {
		int[] common1 = {1, 2, 3, 4};
		int[] common2 ={2, 4, 8};
		NN n = new NN();
		System.out.println(n.solution(common1));
		System.out.println(n.solution(common2));
	}

}
class NN {
    public int solution(int[] common) {
        int answer = 0;
        
        if((common[1] - common[0]) == (common[2] - common[1])) // 등차수열일 경우
            answer = common[common.length-1] + (common[1] - common[0]);
        else // 등비수열일 경우
            answer = common[common.length-1] * (common[1] / common[0]);
        return answer;
    }
}