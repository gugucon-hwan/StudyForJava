package practice6_Q;


/*���δ� �ۼ��� : hwan
 * [6-22] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : isNumber
 * �� �� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
 * ��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�,
 * �׷��� ������ false�� ��ȯ�Ѵ�.
 * ���� �־��� ���ڿ��� null�̰ų� ���ڿ������̶�� false�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : boolean
 * �Ű����� : String str - �˻��� ���ڿ�
 * [Hint] StringŬ������ charAt(int i)�޼��带 ����ϸ� ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�.
 * 
 * [������]
 * 123�� �����Դϱ�? true
 * 1234o�� �����Դϱ�? false
 * 
 */

public class Practice6_22 {
	
	/*
	(1) isNumber�޼��带 �ۼ��Ͻÿ�.
	*/
	static boolean isNumber(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>'0'&&str.charAt(i)<'9'))
				return false;
		}		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	}
}
