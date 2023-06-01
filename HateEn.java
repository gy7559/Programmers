package com.study;

public class HateEn {

	public static void main(String[] args) {
		String numbers ="onetwothreefourfivesixseveneightnine";
		HE he = new HE();
		
		System.out.println(he.solution(numbers));
	}

}

class HE {
    public long solution(String numbers) {
        long answer = 0;
        String[] matchNumbers = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};
        
         for (int i = 0; i < matchNumbers.length; i++) {
            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);

        
       
    }
}