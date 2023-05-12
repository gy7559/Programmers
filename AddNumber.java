package com.study;

public class AddNumber {

	public static void main(String[] args) {
		String my = "aAb1B2cC34oOp";
		AddN an = new AddN(my);
		
		an.solution();
		System.out.println(an.answer);	

	}

}
class AddN {
	String my_string;
	int answer = 0;
    public int solution() {
         String[] stringArray = my_string.split("[a-zA-Z]");
        for (String value : stringArray) {
            answer += value.isEmpty() ? 0 : Integer.parseInt(value);
        }
        return answer;
    }
    public AddN(String my) {
    	this.my_string = my;
    }
}