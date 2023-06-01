package com.study;

public class RemoveCross {

	public static void main(String[] args) {
		String my_string = "people";
			
		RC rc = new RC();
		System.out.println(rc.solution(my_string));
	}

}
class RC {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < charArray.length; i++) {
            if (!sb.toString().contains(String.valueOf(charArray[i]))){
                sb.append(charArray[i]);
            }
        }
        
        return sb.toString();
    }
}