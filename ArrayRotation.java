package com.study;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10,8,6};
		
		ArrayRote array = new  ArrayRote(x,"right");
		
		array.solution();
		
		System.out.println(array.answer);
		
	}

}


class ArrayRote {
	int[] numbers;
	String direction;
	int[] answer;
    public int[] solution() {
        answer = new int[numbers.length];
        
        if(direction.equals("left")){
            
        for(int i=0;i<numbers.length;i++){
            
            if(i==numbers.length-1){
                answer[i]=numbers[0];
            }else{
            answer[i]=numbers[i+1];
            }
        }
            
        }else if(direction.equals("right")){
            
            for(int i=0;i<numbers.length;i++){
            
            if(i==0){
                answer[i]=numbers[numbers.length-1];
            }else{
            answer[i]=numbers[i-1];
            }
        }
            
        }
    
        return answer;
    }
    public ArrayRote(int[] n,String d) {
    	this.numbers = n;
    	this.direction = d;
    }
}