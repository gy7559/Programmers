package com.study;

public class OrderedPair {

	public static void main(String[] args) {
		Solution solution = new Solution(20);
		
		solution.solution();
		
		System.out.println(solution.answer);
	}

}


class Solution {
	int n;
	int answer = 0;
    public int solution() {
            for(int t =1;t<=n;t++){
                if(n%t == 0){
                    answer++;
                }
            
        }
        return answer;
    }
    public Solution(int n){
    	this.n = n;
    }
    	
}