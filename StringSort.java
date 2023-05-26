package com.study;
import java.util.*;
public class StringSort {

	public static void main(String[] args) {
		String s = "asdgf2324klsd05jd9";
		SS ss= new SS();
		System.out.println(Arrays.toString(ss.solution(s)));

	}

}

class SS {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", ""); 
        
        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
		}
        Arrays.sort(answer);
        return answer;
    }
}