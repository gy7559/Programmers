package com.study;

public class Parallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dots = {{1, 4},{9, 2},{3, 8},{11, 6}};
		Pa p = new Pa();
		System.out.println(p.solution(dots));
	}

}
class Pa {
    public double findSlope(int[] dot1, int[] dot2) {
        // 기울기 구하는 공식 : (y2 - y1) / (x2 - x1)
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        if (findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
            return 1;
        }

        // (0, 2), (1, 3)
        if (findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
            return 1;
        }

        // (0, 3), (1, 2)
        if (findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
            return 1;
        }
        return answer;
    }
}