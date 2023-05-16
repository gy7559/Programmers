package com.study;

public class StringOver {

	public static void main(String[] args) {
		int a= 4;
		String s = "hi";
		StrOv st = new StrOv(s,a);
		
		st.solution();
		System.out.println(st.answer);
	}

}
class StrOv{
	String answer = "";
	String my_string;
	int n;
    public String solution() {
        
        
        for(int i =0; i <my_string.length(); i++ ){
            for(int j=0;j<n;j++){
            answer +=  my_string.charAt(i);
                }
        }
        
        return answer;
    }
    public StrOv(String s, int a) {
    	this.n =a;
    	this.my_string=s;
    }
}