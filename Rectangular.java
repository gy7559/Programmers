package com.study;

public class Rectangular {

	public static void main(String[] args) {
		int[][] a = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		Rec r = new Rec();
		System.out.println(r.solution(a));

	}

}
class Rec {
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        return w * h;
    }
}