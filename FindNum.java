package com.study;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 29183;
		int k=1;
		FNum fn = new FNum();
		System.out.println(fn.solution(num,k));
	}
	
}
class FNum {
    public int solution(int num, int k) {
        int answer = 0;
        
       
        String kt = Integer.toString(k);
        String str = Integer.toString(num);
        if(str.indexOf(kt)>=0){
        answer = str.indexOf(kt) +1;
        }else{
            answer = str.indexOf(kt);
        }
        
        
        return answer;
    }
}