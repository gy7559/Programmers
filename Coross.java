package com.study;

public class Coross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] lisne = {{0, 1}, {2, 5}, {3, 9}};
		
		CL cl = new CL();
		System.out.println(cl.solution(lisne));
	}

}
class CL {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        int answer = 0;
        
        // lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;
        
        // arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        
        return answer;
    }
}