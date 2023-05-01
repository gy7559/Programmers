package com.study;

public class Dot {

	public static void main(String[] args) {
		int[] dot = {2,4};
		DotInt solution = new DotInt(dot);
		
		solution.solution();
		
		System.out.println(solution.answer);
	}

}


class DotInt {
	int[] dot;
	int answer = 0;
    public int solution() {
        
        int x=dot[0];
        int y=dot[1];
        
        if(x>0 && y>0){
            answer = 1;
        }else if(x<0 && y>0){
            answer = 2;
        }else if(x<0 && y<0){
            answer = 3;
        }else if(x>0 && y<0){
            answer = 4;
        }
        
    
        
        return answer;
    }
    public DotInt(int[] n){
    	this.dot = n;
    }
    	
}