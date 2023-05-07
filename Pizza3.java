package com.study;

public class Pizza3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int z = 5;
		PizzaDivide pizza = new PizzaDivide(z,a);
		
		pizza.solution();
		System.out.println(pizza.answer);
	}

}


class PizzaDivide {
	int slice;
	int n;
	 int answer = 0;
    public int solution() {
      
        
        int p = 1;
        while(true){
        if((slice*p)>=n){
             answer = p;
             return answer;
        }else{
            p++;
            }
        }
    }
    public PizzaDivide(int s, int a) {
    	this.slice =s;
    	this.n = a;
    }
    
}