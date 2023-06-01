package com.study;
import java.util.HashMap;
import java.util.Map;

public class Login {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		
		Log l = new Log();
		System.out.println(l.solution(id_pw, db));

	}

}




class Log {
    public String solution(String[] id_pw, String[][] db) {
        
        
        Map<String, String> dbMap = new HashMap<String, String>();

        for (String[] strings : db) {
            dbMap.put(strings[0], strings[1]);
        }
        
        
        if (dbMap.containsKey(id_pw[0])) {
            if (dbMap.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}