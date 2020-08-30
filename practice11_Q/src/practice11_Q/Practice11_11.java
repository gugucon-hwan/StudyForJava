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
class SutdaCard3 {
	int num;
	boolean isKwang;

	SutdaCard3() {
		this(1, true);
	}

	SutdaCard3(int num, boolean isKwang) {
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
		SutdaCard3 other = (SutdaCard3) obj;
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
		SutdaCard3 c1 = new SutdaCard3(3,true);
		SutdaCard3 c2 = new SutdaCard3(3,true);
		SutdaCard3 c3 = new SutdaCard3(1,true);
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
	}

}
