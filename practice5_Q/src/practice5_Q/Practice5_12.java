package practice5_Q;

import java.util.Scanner;

/*Chapter 5-12 자바의 정석 개인 정답 */
public class Practice5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] engCode= new String[] {"chair","computer","integer"};
		String[] answerCode= new String[] {"의자","컴퓨터","정수"};
		int count=0;
		int cA=0;
		String tmp=new String("");
		Scanner sc = new Scanner(System.in);
		
		while(count<3) {			
			System.out.println("Q"+count+". "+engCode[count]+"의 뜻은?");
			tmp=sc.nextLine();
			if(tmp.equals(answerCode[count])) {
				System.out.println("정답입니다.");
				System.out.println();
				cA++;
			}else {
				System.out.println("틀렸습니다. 정답은"+answerCode[count]+"입니다");
			}			
			count++;
		}
		System.out.println("전체 "+count+"문제 중 "+cA+"문제 맞추셨습니다.");
	}
}
