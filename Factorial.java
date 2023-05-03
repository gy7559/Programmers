package com.study;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 375902;
		Fac fac = new Fac(s);
		
		fac.solution();
		
		System.out.println(fac.answer);
	}

}
class Fac {
	int n;
	int answer = 0;
    public int solution() {
        int t = 1;
        for(int x = 1; x<=n;x++){
            t = t*x;    
            if(t==n){
                answer = x;
                break;
            }else if(t>n){
                answer = x-1;
                break;
            }
        }
        
        
        return answer;
        
    }
    public Fac(int n) {
    	this.n = n;
    }
}