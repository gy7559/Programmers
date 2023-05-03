package com.study;

public class CompositeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compos compos = new Compos(10);
		
		compos.solution();
		
		System.out.println(compos.answer);
	}

}



class Compos {
	int answer = 0;
	int n;
    public int solution() {
        
        
        for(int i=1;i<=n;i++){
            int x=0;
        
            for(int a=1;a<=i;a++){
                if(i%a==0){
                    x++;
                }
            }
            if(x>2){
             answer++;   
                }
        }
        
        return answer;
    }
    public Compos(int x) {
    	this.n = x;
    }
}