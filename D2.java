package com.study;

import java.util.Arrays;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D21 d = new D21();
		int[] a = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.deepToString(d.solution(a, 2)));
	}

}
class D21 {
    public int[][] solution(int[] num_list, int n) {
        
        int[][] answer = new int[num_list.length/n][n];
        int d=0;
        for(int i = 0; i<num_list.length/n;i++){
            for(int j = 0; j<n;j++){
                answer[i][j]= num_list[d];
                d++;
            }
        }
        
        return answer;
    }
}