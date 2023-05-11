package com.study;

import java.util.Arrays;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rpc rpc = new Rpc("250");
		
		rpc.solution();
		System.out.println(rpc.sb);	
	}

}
class Rpc {
	String rsp;
	 StringBuilder sb = new StringBuilder();
    public String solution() {
      
        for (int i = 0; i < rsp.length(); i++) {
            sb.append(rsp.split("")[i].equals("2") ? "0"
                            : rsp.split("")[i].equals("0") ? "5" : "2");
        }
        return sb.toString();
    }
    public Rpc(String rsp) {
    	this.rsp =rsp;
    }
}