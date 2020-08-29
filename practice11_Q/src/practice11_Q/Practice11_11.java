package practice11_Q;

import java.util.HashSet;
/*
 * [11-11] ������ SutdaCardŬ������ HashSet�� �����ϰ� ����ϴ� �����̴�. 
 * HashSet�� �ߺ��� ī�尡 ������� �ʵ��� SutdaCard�� hashCode()�� �˸°� �������̵��Ͻÿ�.
 * [Hint] StringŬ������ hashCode()�� ����϶�.
 * 
 * 
 * 
 */
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		result = prime * result + (isKwang ? 1231 : 1237);		
		return result;
	}
	/*
	public int hashCode() {
		return toString().hashCode(); // StringŬ������ hashCode()�� ȣ���Ѵ�.
	}
    */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SutdaCard other = (SutdaCard) obj;
		if (isKwang != other.isKwang)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Practice11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
	}

}
