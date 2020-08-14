package practice6_Q;

import java.util.Arrays;

/*���δ� �ۼ��� : hwan
 * [6-20] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * [����] Math.random()�� ����ϴ� ��� �������� �ٸ� �� ����.
 * �޼���� : shuffle
 * �� �� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
 * ó���� �迭�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int[]
 * �Ű����� : int[] arr - �������� ��� �迭 
 * 
 * [������]
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * [4, 6, 8, 3, 2, 9, 7, 1, 5]
 * 
 */
public class Practice6_20 {
	
	/*
	(1) shuffle�޼��带 �ۼ��Ͻÿ�.
	*/
	static int[] shuffle(int[] arr) {
		int Rvalue,temp;
		//int[] arr2=new int[arr.length];		
		//System.arraycopy(arr, 0, arr2, 0, arr.length);
		//System.out.println(Arrays.toString(arr2));		
		
		for(int i=0;i<arr.length;i++) {
			Rvalue=(int)(Math.random()*9)+1;
			
			temp=arr[Rvalue-1];
			arr[Rvalue-1]=arr[i];
			arr[i]=temp;
			
		}
	 return arr;	
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
