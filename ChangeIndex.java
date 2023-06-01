package com.study;

public class ChangeIndex {

	public static void main(String[] args) {
		String my_string ="hello";
		int num1 =1;
		int num2 =2;
		CI ci = new CI();
		
		System.out.println(ci.solution(my_string, num1, num2));
	}

}
class CI {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] s = my_string.split("");
        
        for(int i =0; i<s.length;i++){
            if(i==num1){
                answer +=s[num2];
            }else if (i==num2){
                answer +=s[num1];
            }else{
                answer +=s[i];
            }
            
        }
        return answer;
    }
}