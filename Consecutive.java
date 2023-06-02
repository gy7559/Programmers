package com.study;
import java.util.*;
public class Consecutive {

	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		Cons c = new Cons();
		System.out.println(Arrays.toString(c.solution(num, total)));
	}

}
class Cons {
    public int[] solution(int num, int total) {
        int[] answer =  new int[num];
        int start = (total/num) - ((num - 1)/2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }
}