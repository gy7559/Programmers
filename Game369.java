package com.study;

public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int order =	29423;
		G369 g = new G369();
		
		System.out.println(g.solution(order));
	}

}

class G369 {
    public int solution(int order) {
        int answer = 0;
        String strOrder = "" + order;
        for (int i = 0; i < strOrder.length(); i++) {
            char tempChar = strOrder.charAt(i);

            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }
        return answer;
    }
}