package com.study;

import java.util.Arrays;

public class DivisorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divd as = new divd();
		System.out.println(Arrays.toString(as.solution(24)));
	}

}
class divd {
    public int[] solution(int n) {
        int s = 0;
        int t = 0;
        for(int a =1;a<=n;a++){
            if(n%a==0){
                t++;
            }
        }
        int[] answer = new int[t];
        for(int a =1;a<=n;a++){
            if(n%a==0){
                answer[s] = a;
                s++;
            }
        }
        return answer;
    }
}