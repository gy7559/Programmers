package com.study;

import java.util.Arrays;

public class CurseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 1;
		Cus cus = new Cus(t);
		 
		for(int i = 0;i<100;i++) {
		cus.solution();
		System.out.println(cus.answer);
		t++;
		}
		
		
		
	}

}
class Cus {
	int n;
	int answer = 0;
    public int solution() {
        
    	for(int i = 0; i < n ; i++){
            ++answer;
           if(answer%3==0){
                 ++answer;
           }
           if(answer==3){
               answer=answer+1;
           } 
           if(answer==13){
               answer=answer+1;
           }
           if(answer==23){
               answer=answer+1;
           }
           if(answer>=30&&answer<40){
               answer=answer+9;
           }
           if(answer==43){
               answer=answer+1;
           }
           if(answer==53){
               answer=answer+1;
           }
           if(answer==63){
               answer=answer+1;
           }
           if(answer==73){
               answer=answer+1;
           }
           if(answer==83){
               answer=answer+1;
           }
           if(answer==93){
               answer=answer+1;
           }
            if(answer==103){
               answer=answer+1;
           }
            if(answer==113){
               answer=answer+1;
           }
            if(answer==123){
               answer=answer+1;
           }
            if(answer==130){
               answer=answer+10;
           }
            if(answer==143){
               answer=answer+1;
           }
            if(answer==153){
               answer=answer+1;
           }
            if(answer==163){
               answer=answer+1;
           }
            if(answer==173){
               answer=answer+1;
           }
            if(answer==183){
               answer=answer+1;
           }
           if(answer%3==0){
                 answer++;
           }
       
       }
        return answer;
    }
    public Cus(int t) {
    	this.n = t;
    }
}