package com.study;

public class StringArr {

	public static void main(String[] args) {
		String[] srt= {"We", "are", "the", "world!"};
		Arr solution = new Arr(srt);
		
		solution.solution();
		
		System.out.println(solution.answer);
	}

}
class Arr {
	int[] answer = {};
	String[] strlist;
    public int[] solution() {
        answer = new int[strlist.length];
        int t =0;
        for(int a=0; a<strlist.length;a++){
            t = strlist[a].length();
            answer[a] = t;
        }
        
        return answer;
    }
    public Arr(String[] str) {
    	this.strlist =str;
    }
}