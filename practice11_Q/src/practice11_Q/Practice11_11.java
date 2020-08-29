package practice11_Q;

import java.util.HashSet;
/*
 * [11-11] 다음은 SutdaCard클래스를 HashSet에 저장하고 출력하는 예제이다. 
 * HashSet에 중복된 카드가 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩하시오.
 * [Hint] String클래스의 hashCode()를 사용하라.
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
		return toString().hashCode(); // String클래스의 hashCode()를 호출한다.
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
