package practice6_Q;

/*���δ� �ۼ��� : hwan
 * [6-23] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : max
 * �� �� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ�.
 * ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : int[] arr - �ִ밪�� ���� �迭 
 * 
 * [������]
 * [3, 2, 9, 4, 7]
 * �ִ밪:9
 * �ִ밪:-999999
 * �ִ밪:-999999
 * 
 */

public class Practice6_23 {
	/*
	(1) max�޼��带 �ۼ��Ͻÿ�.
	*/
	static int max(int[] arr) {
		int tMax=0;
		if(arr==null||arr.length==0)
			return -999999;
		for(int i=0;i<arr.length;i++) {
			if(tMax<arr[i])
				tMax=arr[i];
		}					
		return tMax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪:"+max(null));
		System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭
	}

}
