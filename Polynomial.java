package com.study;

public class Polynomial {

	public static void main(String[] args) {
		String polynomial = "3x + 7 + x";
		Pol p = new Pol();
		System.out.println(p.solution(polynomial));

	}

}
class Pol {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +"); //polynomial를  + 부분마다 나누어 항을 만듬 +는 포함하지 않음
        int strNum = 0;
        int num = 0;
        //s 가 arr의 항을 얻고 항의 갯수만큼 반복
        for (String s : arr) {
        	
        	//x항앞에 숫자가 없을때 1을 추가
            if (s.equals("x")) {
                strNum += 1;
            } else if (s.contains("x")) {
            	//x항에 숫자가 있을때 x앞의 String숫자를 읽어와 int로 변환하여 저장
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
            	//String숫자를 읽어와 int로 변환하여 저장
                num += Integer.parseInt(s);
            }
        }
        //x항 만 숫자가 있을때
        if (strNum != 0 && num == 0) {
            if (strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        } 
        //x와 일반 숫자 둘다 있을때
        if (strNum != 0 && num != 0) {
            if (strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }
        // x가 달린 숫자가 없고 그냥 숫자가 있을때
        if (strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }
        
        
        
        
        
        return answer;
    }
}