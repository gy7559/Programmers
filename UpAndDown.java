package com.study;

public class UpAndDown {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		UAD ud = new UAD();
		
		System.out.println(ud.solution(my_string));
	}

}
class UAD {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}