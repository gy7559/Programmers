package com.study;

public class Pizza1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		PizzaSlies pizza = new PizzaSlies(a);
		
		pizza.solution();
		System.out.println(pizza.answer);
	}

}
class PizzaSlies {
	int n;
	 int answer = 0;
    public int solution() {
       
        if(n%7==0){
            answer = n/7;
        } else if(n/7==0){
            answer = 1;
        }else {
            answer = n/7 + 1;
        }
        return answer;
    }
    public PizzaSlies(int z) {
    	this.n = z;
    }
}