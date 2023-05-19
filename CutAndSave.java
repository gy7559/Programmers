package com.study;


import java.util.Arrays;

public class CutAndSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		CAS ca = new CAS();
		System.out.println(Arrays.toString(ca.solution(my_str,n)));
	}

}

class CAS {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int t = my_str.length()/n;
        
        if(my_str.length()%n == 0){
            answer = new String[t];
            }else{
                answer = new String[t+1];
        }
        
        
        for(int a = 0;a<answer.length;a++){
            int x = a*n;
            int b = (a+1)*n;
            if(b>my_str.length()){
                answer[a] = my_str.substring(x);
            }else{
            answer[a] = my_str.substring(x,b);
                }
        }
        return answer;
}
    }