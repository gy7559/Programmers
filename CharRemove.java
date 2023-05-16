package com.study;

public class CharRemove {

	public static void main(String[] args) {
		ChRe ch= new ChRe("hellow","he");
		ch.solution();
		
		System.out.println(ch.answer);
	}

}
class ChRe {
	String my_string;
	String letter;
	 String answer;
    public String solution() {
        answer = my_string.replaceAll(letter,"");
        
        return answer;
    }
    public ChRe(String my,String l) {
    	this.letter =l;
    	this.my_string = my;
    }
}
