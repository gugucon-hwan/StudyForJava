package practice9_Q;

/*
 * [9-1] ������ ���� �������� �򵵷� SutdaCardŬ������ equals()�� ��������� num, isKwang�� ���� ���ϵ��� �������̵��ϰ� �׽�Ʈ �Ͻÿ�.
 * 
 * 
 * [������]
 * c1=3K
 * c2=3K
 * c1.equals(c2):true
 * 
 */

public class Practice9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}

}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		/*
		 * (1) �Ű������� �Ѱ��� ��ü�� num, isKwang�� ������� num, isKwang�� ���ϵ��� �������̵� �Ͻÿ�.
		 */
		if(this.num==((SutdaCard)obj).num&&this.isKwang==((SutdaCard)obj).isKwang) {
			return true;
		}
		return false;
		/*
		 * if(obj instanceof SutdaCard) {
					SutdaCard c = (SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
			}
			return false;
		 */
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}