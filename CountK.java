package com.study;

public class CountK {

	public static void main(String[] args) {
		int i =1;
		int j = 13;
		int k = 1;
		CK ck = new CK();
		System.out.println(ck.solution(i, j, k));

	}

}
class CK {
    public int solution(int i, int j, int k) {
        int count = 0;
        String strK = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String value = String.valueOf(l);
            if (value.contains(strK)) {
                String[] array = value.split("");
                for (String alpha : array) {
                    if (alpha.equals(strK)) count++;
                }
            }
        }
        return count;
    }
}