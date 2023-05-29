package com.study;
import java.util.*;
public class TryCom {

	public static void main(String[] args) {
		int[] sides = {11, 7};
		TrCo tc = new TrCo();
		
		System.out.println(tc.solution(sides));

	}

}



class TrCo{
    public int solution(int[] sides) {
        int answer = 0;
        int max =0;
        int min =0;
        
        Arrays.sort(sides);
        min = sides[1] - sides[0];
        max = sides[1] + sides[0];
     
        answer = max-min-1;
        return answer;
    }
}