package com.study;
import java.util.*;
public class Factorization {

	public static void main(String[] args) {
		Factor f = new Factor();
		int a = 34;
		System.out.println(Arrays.toString(f.solution(a)));

	}

}


class Factor {
    public int[] solution(int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if (n != 1) set.add(n);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}