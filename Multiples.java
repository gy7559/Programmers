package com.study;

import java.util.Arrays;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int[] numlist= {4, 5, 6, 7, 8, 9, 10, 11, 12};
		Multe mu = new Multe();
		System.out.println(Arrays.toString(mu.solution(n,numlist)));
	}

}

class Multe {
    public int[] solution(int n, int[] numlist) {
        int t = 0;
        int s= 0;
        for(int a = 0; a<numlist.length;a++){
            if(numlist[a]%n==0){
                t++;
            }
        }
        
        int[] answer = new int[t];
        for(int a = 0; a<numlist.length;a++){
            if(numlist[a]%n==0){
                answer[s]=numlist[a];
                s++;
            }
        }
        
        
        return answer;
    }
}
