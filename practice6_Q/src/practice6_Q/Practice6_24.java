package practice6_Q;

/*
 * [6-24] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : abs
 * �� �� : �־��� ���� ���밪�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : int value
 * 
 * [������]
 * 5�� ���밪:5
 * -10�� ���밪:10   
 */

public class Practice6_24 {
	/*
	(1) abs�޼��带 �ۼ��Ͻÿ�.
	*/
	public static int abs(int value) {
		if(value<0)
			value*=-1;
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value+"�� ���밪:"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:"+abs(value));
	}
}
