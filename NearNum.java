package com.study;

public class NearNum {
	public static void main(String[] args) {
		int[] t = {3,10,28};
		int x = 28;
		Near s = new Near(t,x);
		s.solution();
		System.out.println(s.answer);
	}
}
class Near {
	int[] array;
	int n;
	int answer = 0;
    public int solution() {
        int t = 0;
        int x = 0;
        int s = 100;
        int g = 0;
        int h = 0;
        for(int a = 0;a<array.length;a++){
            t = array[a] - n;
            x = Math.abs(t);
            h = array[g]-n;
            if(s>=x){
                if(Math.abs(h)==x){
                    if(array[g]>array[a]){
                        g=a;
                    }
                }else{
                g=a;
                }
                s=x;
            }
        }
        answer =  array[g];
        return answer;
    }
    public Near(int[] a, int b) {
    	this.array = a;
    	this.n = b;
    }
    
}