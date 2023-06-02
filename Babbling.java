package com.study;

public class Babbling {

	public static void main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		BBB bb = new BBB();
		System.out.println(bb.solution(babbling));
	}

}

class BBB {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "0");
            babbling[i] = babbling[i].replaceFirst("woo", "0");
            babbling[i] = babbling[i].replaceFirst("ye", "0");
            babbling[i] = babbling[i].replaceFirst("ma", "0");
            babbling[i] = babbling[i].replace("0", "");
            
            if(babbling[i].equals("")) answer++;
        }
        
        return answer;
    }
}