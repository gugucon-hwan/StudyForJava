package practice5_Q;

/*Chapter 5-9 자바의 정석 개인 정답 */
public class Practice5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } };
		char[][] result = new char[star[0].length][star.length];//5,4
		
		for (int i = 0; i < star.length; i++) {//4
			for (int j = 0; j < star[i].length; j++) {//5
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < star.length; i++) {//4
			for (int j = 0; j < star[i].length; j++) {//5
				
				result[j][i]=star[3-i][j];
			}
		}		
		for (int i = 0; i < result.length; i++) {//5
			for (int j = 0; j < result[i].length; j++) {//4
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
