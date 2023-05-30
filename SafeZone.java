package com.study;

public class SafeZone {

	public static void main(String[] args) {
		SZ sz = new SZ();
		int[][] b = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		System.out.println(sz.solution(b));
	}

}
class SZ {
    public int solution(int[][] board) {
        int[][] list= new int [board.length+2][board.length+2];
        int answer = 0;
        for(int i = 0; i<board.length;i++){
             for(int y = 0; y<board.length;y++){
                 if(board[i][y]==1){
                     for(int a=(i-1)+1;a<=(i+1)+1; a++){
                         for(int b =(y-1)+1; b<=(y+1)+1; b++){
                             if(list[a][b] !=1){
                                 list[a][b]=2;
                             }
                         }
                     }
                 }
             }
        }
        for(int i = 1; i<list.length-1;i++){
            for(int y=1;y<list.length-1;y++){
                if(list[i][y]==0){answer++;}
            }
        }
        return answer;
    }
}