package practice6_Q;


/*���δ� �ۼ��� : hwan
 * [6-2] ����6-1���� ������ SutdaCardŬ������ 
 * �� ���� �����ڿ� info()�� �߰��ؼ� ���� ����� ���� ����� �򵵷� �Ͻÿ�.

[������]
3
1K

 */

public class Practice6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());		
	}

}
class SutdaCard {
/*
(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
*/
	int num;
	boolean isKwang;
	public SutdaCard() {
		// TODO Auto-generated constructor stub
		this.num=1;
		this.isKwang=true;
	}	
	public SutdaCard(int num, boolean isKwang) {
		this.num=num;
		this.isKwang=isKwang;
	}
	/*
	 * SutdaCard() {
		this(1, true); // SutdaCard(1, true)�� ȣ���Ѵ�.
		}
	 */
	
	public String info() {
		String c1 = Integer.toString(num);
		String c2 = "";
		if(isKwang==true) {
		c2 = "K";
		}
		return c1+c2;
	}
	/*
	 * String info() { // ���ڸ� ���ڿ��� ��ȯ�Ѵ�. ��(��)�� ��� K�� �����δ�. 
	 * return num + ( isKwang? "K" : "");
	 * }
	 */
	
};


