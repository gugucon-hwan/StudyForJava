package practice6_Q;

/*
 * ���δ� �ۼ��� : hwan
 * [6-7] ����6-6���� �ۼ��� Ŭ�����޼��� getDistance()��
 *  MyPointŬ������ �ν��Ͻ��޼���� �����Ͻÿ�.
 * 
 * [������]
 * 1.4142135623730951
 */

public class Practice6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(1, 1);
		// p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * (1) �ν��Ͻ��޼��� getDistance�� �ۼ��Ͻÿ�.
	 */
	
	public double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(x, x1)+Math.pow(y, y1));	
	}
}