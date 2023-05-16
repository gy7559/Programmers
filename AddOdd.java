package com.study;

public class AddOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class AO {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
      
            for(int x = 0; x<=n;x++){
                if(x%2==0){
                    sum = sum+x;
                }
            }
        answer =sum;
        return answer;
    }
}
