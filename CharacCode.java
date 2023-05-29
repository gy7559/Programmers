package com.study;

import java.util.*;

public class CharacCode {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		CC c = new CC();
		System.out.println(Arrays.toString(c.solution(keyinput, board)));

	}

}
class CC {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int[] u = {0,1};
        int[] d = {0,-1};
        int[] r = {1,0};
        int[] l = {-1,0};
        int t = keyinput.length;
        for(int i = 0; i < t;i++){
            if(keyinput[i].equals("left")){
                if(answer[0]==-board[0]/2){
                    answer = answer;
                }else{
                    answer[0]--;
                }
            }else if(keyinput[i].equals("right")){
                 if(answer[0]==board[0]/2){
                    answer = answer;
                }else{
                    answer[0]++;
                }
                
            }else if(keyinput[i].equals("up")){
               if(answer[1]==board[1]/2){
                    answer = answer;
                }else{
                    answer[1]++;
                }
                
            }else if(keyinput[i].equals("down")){
                if(answer[1]==-board[1]/2){
                    answer = answer;
                }else{
                    answer[1]--;
                }
                
            }
        }
        return answer;
    }
}