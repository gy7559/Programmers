package com.study;

public class Discount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 540000;
		
		Dis dis = new Dis(c);
		
		dis.solution();
		System.out.println(dis.answer);
	}

}
class Dis {
	int price;
	int answer = 0;
    public int solution() {
        
        if(price >= 100000&& price <300000){
            answer = price*95/100;
        }else if(price>= 300000 && price <500000){
            answer = price*90/100;
        }else if(price>= 500000){
            answer = price*80/100;
        }else{
            answer = price;
        }
        return answer;
    }
    public Dis(int c) {
    	this.price = c;
    }
}