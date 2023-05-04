package com.study;

public class VowelRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove solution = new Remove("avdgwe");
		
		solution.solution();
		
		System.out.println(solution.answer);
	}

}
class Remove {
	String answer = "";
	String my_string;
    public String solution() {
        
        
        my_string = my_string.replaceAll("a","");
        my_string = my_string.replaceAll("i","");
        my_string = my_string.replaceAll("o","");
        my_string = my_string.replaceAll("u","");
        my_string = my_string.replaceAll("e","");
        
        
        answer = my_string;
        return answer;
    }
    public Remove(String s) {
    	this.my_string = s;
    }
}