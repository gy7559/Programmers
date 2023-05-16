package com.study;

import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {
		int[] x = {1,2,4,6,5,3};
		OdVe o = new OdVe(x);
		
		o.solution();
		System.out.println(Arrays.toString(o.answer));

	}

}

class OdVe {
	int[] num_list;
	int[] answer = {0,0};
    public int[] solution() {
        int j = 0;
        int h = 0;
        for(int i = 0; i < num_list.length;i++){
            if(num_list[i]%2==0){
                j++;
            }
            else{
                h++;
            }
            
        }
        answer[0] = j;
        answer[1] = h;
        return answer;
    }
    public OdVe(int[] a) {
    	this.num_list = a;
    }
}