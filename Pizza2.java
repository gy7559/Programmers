package com.study;

public class Pizza2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		PizzaShare pizza = new PizzaShare(a);
		
		pizza.solution();
		System.out.println(pizza.answer);
	}

}

class PizzaShare {
	int n;
	int answer = 0;
    public int solution() {
      
        
        int p = 1;
        while(true){
        if((6*p)%n==0){
             answer = p;
             return answer;
        }else{
            p++;
            }
        }
    }
    public PizzaShare(int a) {
    	this.n = a;
    }
}