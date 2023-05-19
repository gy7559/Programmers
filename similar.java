package com.study;

import java.util.Arrays;

public class similar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"a", "b", "c"};
		String[] s2= {"com", "b", "d", "p", "c"};
		Sim sm = new Sim();
		System.out.println(sm.solution(s1,s2));
	}

}
class Sim {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int x = 0;
        for(int a = 0; a < s1.length;a++){
            for(int b = 0; b< s2.length; b++){
                
                if(s1[a].equals(s2[b])){
                   x=x+1; 
                }
            }
        }
        answer = x;
        return answer;
    }
}