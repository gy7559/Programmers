package com.study;

public class Ant {

	public static void main(String[] args) {
		AntAmry solution = new AntAmry(23);
		
		solution.solution();
		
		System.out.println(solution.answer);
	}

}


class AntAmry {
	int hp;
	int answer = 0;
    public int solution() {
        int a = 1;
        int b = 3;
        int c = 5;
        int s = hp;
        for(int x= 0; x<=hp; x++){
             for(int y= 0; y<=hp; y++){
                  for(int z= 0; z<=hp; z++){
                      if(hp == x*a + y*b+ z*c && s >= x+y+z){
                          s = x+y+z;
                      }
                          
                  }
             }
        }
        
        answer = s;
        return answer;
    }
    public AntAmry(int n){
    	this.hp = n;
    }
    	
}