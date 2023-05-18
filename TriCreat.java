package com.study;

public class TriCreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri2 a =new Tri2();
		int[] s = {1,2,54};
		a.solution(s);
		System.out.println(a.answer);
	}

}
class Tri2 {
	int answer = 0;
    public int solution(int[] sides) {
        
        int big = 0;
        int t = 0;
        int sum = 0;
        for(int a=0; a <3;a++){
            if(big<sides[a]){
                big = sides[a];
                t=a;
            }
        }
       for(int c =0; c<3;c++){
           if(c!=t){
               sum = sum + sides[c];
           }
       }
        if(big>=sum){
            answer = 2;
        }else{
            answer = 1;
        }
        return answer;
    }
    
}