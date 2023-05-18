package com.study;

public class BinaryAdd {

	public static void main(String[] args) {
		Add2 a = new Add2("110","101");
		
		a.solution();
		System.out.println(a.answer);

	}

}
class Add2 {
	String answer = "";
	String bin1;
	String bin2;
    public String solution() {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        answer = Integer.toBinaryString(res);
        return answer;
    }
    
    public Add2(String bin1,String bin2) {
    	this.bin1 = bin1;
    	this.bin2 = bin2;
    }
}
