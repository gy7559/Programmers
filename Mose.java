package com.study;

public class Mose {

	public static void main(String[] args) {
		MoseSo m = new MoseSo();
		String le = ".... . .-.. .-.. ---";
		System.out.println(m.solution(le));
	}

}
class MoseSo {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        
        String answer = "";
        return sb.toString();
    }
}
