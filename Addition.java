package com.study;

import java.util.Arrays;

public class Addition {

	public static void main(String[] args) {
		Add add = new Add(9,2,1,3);
		
		add.solution();
		System.out.println(Arrays.toString(add.answer));

	}

}
class Add {
	 int[] answer = new int[2];
	 int denum1;
	 int num1;
	 int denum2;
	 int num2;
    public int[] solution() {
       
        int top = (denum1 * num2) + (denum2 * num1);
        int bottom = num1 * num2;

        int divisor = gcd(top, bottom);
        answer[0] = top / divisor;
        answer[1] = bottom / divisor;

        return answer;
    }

    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) return  a;

        return gcd(b, (a % b));
    }
    
    public Add(int d1,int n1,int d2,int n2) {
    	this.denum1 = d1;
    	this.num1 = n1;
    	this.denum2 = d2;
    	this.num2 = n2;
    }
}