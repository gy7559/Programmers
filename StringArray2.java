package com.study;
import java.util.*; 
public class StringArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "Bcad";
		SA2 as = new SA2();
		System.out.println(as.solution(my_string));
	}

}
class SA2 {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        answer = new String(charArr);
        return answer;
    }
}