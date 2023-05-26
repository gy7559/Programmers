package com.study;



import java.util.*;

public class OrderTamp {

	public static void main(String[] args) {
		Order order = new Order();
		int[] a = {34,54,78,12,45};
		System.out.println(Arrays.toString(order.solution(a)));

	}

}

class Order {
	
    public int[] solution(int[] emergency) {
       int[] answer = new int[emergency.length];
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortedEmergency);
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sortedEmergency.length; j++) {
                if (emergency[i] == sortedEmergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }
        
        return answer;
    }
}