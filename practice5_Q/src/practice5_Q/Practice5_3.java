package practice5_Q;

/*Chapter 5-3 자바의 정석 개인 정답 */
public class Practice5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum=" + sum);
	}

}
