package practice5_Q;

/*Chapter 5-11 자바의 정석 개인 정답 */
public class Practice5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];//5->6,3->4
		for (int i = 0; i < score.length; i++) {//5
			for (int j = 0; j < score[i].length; j++) {//3
					
				if(j==0) {// j -> 0번째 세로 합계
					result[score.length][j]+=score[i][j];//5
				}else if(j==1) {
					result[score.length][j]+=score[i][j];
				}else if(j==2) {
					result[score.length][j]+=score[i][j];					
				}
				
				if(i==0) {// i -> 0번째 가로 합계 
					result[i][score[0].length]+=score[i][j];
				}else if(i==1) {
					result[i][score[0].length]+=score[i][j];
				}else if(i==2) {
					result[i][score[0].length]+=score[i][j];
				}else if(i==3) {
					result[i][score[0].length]+=score[i][j];
				}else if(i==4) {					
					result[i][score[0].length]+=score[i][j];
					result[i+1][score[0].length]+=result[i+1][j];
				}				
				result[i][j]=score[i][j];// result 배열 옮기기								
			}
		}
		for (int i = 0; i < result.length; i++) {//5
			for (int j = 0; j < result[i].length; j++) {//3
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}

}
