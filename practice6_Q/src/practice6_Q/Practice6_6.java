package practice6_Q;


/*
 * ���δ� �ۼ��� : hwan
 * [6-6] �� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ��Ͻÿ�.
 * [Hint] ������ ����� Math.sqrt(double a)�� ����ϸ� �ȴ�.
 * 
 * [������]
 * 1.4142135623730951
 */

public class Practice6_6 {
	
	// �� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
	/*
	(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
	*/
	return Math.sqrt(Math.pow(x, x1)+Math.pow(y, y1));	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDistance(1,1,2,2));
	}
}
