package com.study;

public class StringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ab6CDE443fgh22iJKlmn1o";
		String str2="6CD";
		SIS si = new SIS();
		System.out.println(si.solution(str1,str2));
	}

}
class SIS{
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.indexOf(str2)>=0){
            answer = 1;
        }else{
            answer =2;
        }
            
        return answer;
    }
}
