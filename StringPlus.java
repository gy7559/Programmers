package com.study;

public class StringPlus {

	public static void main(String[] args) {
		SP sp = new SP();
		int i = 45785;
		
		System.out.println(sp.solution(i));

	}

}
class SP {
    public int solution(int n) {
        int answer = 0;
        
        String s = String.valueOf(n);
        
        for(char num : s.toCharArray()){
            answer += (num-'0');
        }
        
        
        return answer;
    }
}