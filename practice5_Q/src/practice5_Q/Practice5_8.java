package practice5_Q;

import java.util.Arrays;

/*Chapter 5-8 자바의 정석 개인 정답 */
public class Practice5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
			
			if(1==answer[i]) {
				counter[0]++;
			}else if(2==answer[i]) {
				counter[1]++;
			}else if(3==answer[i]) {
				counter[2]++;
			}else if(4==answer[i]) {
				counter[3]++;
			}					
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");				
			}			
			System.out.println();
		}		
	}
}
