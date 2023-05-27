package com.study;

public class PlantAge {

	public static void main(String[] args) {
		PA pa = new PA();
		int age = 45;
		
		System.out.println(pa.solution(age));
		

	}

}


class PA {
    public String solution(int age) {
        String answer = "";
        String s= String.valueOf(age);
        String[] arr = s.split("");
        
        for(int i = 0; i < arr.length; i++){
            answer += ((char)((Integer.parseInt(arr[i])+97)));
        }
        
        
        return answer;
    }
}
