package com.study;
import java.util.*;
public class OneChar {

	public static void main(String[] args) {
		String s = "abcabcadc";
		
		OI oi = new OI();
		System.out.println(oi.solution(s));

	}

}

class OI {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int count = 0;
        
        Arrays.sort(str);
        
        for(int i =0; i<str.length; i++){
            count = 0;
            
            for(int j=0; j<str.length; j++){
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            
            if(count == 1){
                answer += str[i];
            }
        }
        
        return answer;
    }
}