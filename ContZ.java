package com.study;


import java.util.*;

public class ContZ {

	public static void main(String[] args) {
		CZ cz = new CZ();
		String s = "1 2 Z 3";
		
		System.out.println(cz.solution(s));
		
	}

}





class CZ {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        
        
        
        
        for(String w : s.split(" ")){
            if(w.equals("Z")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(w));
            }
        }
        for(int i : stack){
            answer += i;
        }
        
        
        return answer;
    }
}