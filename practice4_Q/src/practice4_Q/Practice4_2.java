package practice4_Q;

public class Practice4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int sum=0;
		
		for(int i =1; i<=20;i++) {
			if(i%2!=0 && i%3!=0)
				sum +=i;
		}
		System.out.println(sum);
		
	}

}
