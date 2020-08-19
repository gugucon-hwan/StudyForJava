package practice9_Q;


/*
 * [9-8] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : round
 * �� �� : �־��� ���� �ݿø��Ͽ�, �Ҽ��� ���� n�ڸ��� ���� ��ȯ�Ѵ�.
 * ���� ��� n�� ���� 3�̸�, �Ҽ��� 4° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� 3�ڸ��Ǽ��� ��ȯ�Ѵ�.
 * ��ȯŸ�� : double
 * �Ű����� : double d - ��ȯ�� ��
 * int n - �ݿø��� ����� �Ҽ��� �ڸ�
 * [Hint] Math.round()�� Math.pow()�� �̿��϶�.
 * 
 * [������]
3.1
3.14
3.142
3.1415
3.1415
 */
public class Practice9_8 {
	/*
	(1) round�޼��带 �ۼ��Ͻÿ�.
	*/
	public static double round(double d, int n) {
		//System.out.println(Math.pow(0.1, n));		
		d=Math.round(d*Math.pow(10, n))/Math.pow(10, n);
		
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}

}
