package com.study;
import java.util.Arrays;

public class AtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String before = "olleh";	
		String after = "hello";
		AB ab = new AB();
		System.out.println(ab.solution(before, after));
	}

}

class AB {
    public int solution(String before, String after) {
        int[] beforeArray = new int[26];
        int[] afterArray = new int[26];

        for (int i = 0; i < before.length(); i++) {
            beforeArray[before.charAt(i) - 'a']++;
        }

        for (int i = 0; i < after.length(); i++) {
            afterArray[after.charAt(i) - 'a']++;
        }
        int answer =  Arrays.equals(beforeArray, afterArray) ? 1 : 0;
        return answer;
    }
}