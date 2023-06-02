package com.study;

public class ArrrayPush {



	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		AP a = new AP();
		System.out.println(a.solution(A, B));
	}

}
class AP {
    public int solution(String A, String B) {
        
        return (B + B).indexOf(A);
    }
}