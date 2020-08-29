package practice11_Q;

import java.util.HashMap;

/*
 * [11-12] ������ ���ٰ��ӿ��� ī���� ������ �����ϴ� ��޸��(����)�̴�. 
 * HashMap����ް� ������ �����ϴ� registerJokbo()�� ������������ ������ ����ؼ� ��ȯ�ϴ� getPoint()�� �ϼ��Ͻÿ�.
 * [����] ���ٰ����� �� ���� ī���� ���ڸ� ���� ���� 10���� ���� �������� ���� ���� �̱�� �����̴�. 
 * �� �ܿ��� Ư�� ���ڷ� ������ ī��� �̷���� ���(����)�� �־ ���� ����� ī�尡 �̱��.
 * 
 * 
 * [������]
[Ÿ¥]5,9 1004
[���]1,1K 3010
 */

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	int pos = 0; // ������ ������ ī���� ��ġ
	HashMap jokbo = new HashMap(); // ������ ������ HashMap

	SutdaDeck2() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard2(num, isKwang);
		}
		registerJokbo(); // ������ ����Ѵ�.
	}

	SutdaCard2 pick() throws Exception {
		SutdaCard2 c = null;
		if (0 <= pos && pos < CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
		} else {
			throw new Exception("�����ִ� ī�尡 �����ϴ�.");
		}
		return c;
	}

	void shuffle() {
		for (int x = 0; x < CARD_NUM * 2; x++) {
			int i = (int) (Math.random() * CARD_NUM);
			int j = (int) (Math.random() * CARD_NUM);
			SutdaCard2 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
		registerJokbo(); // ������ ����Ѵ�.		
	}	
	
	void registerJokbo(){
	/*
	(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
	1. jokbo(HashMap)�� ������ �����Ѵ�.
	�� ī���� ���� ���ڿ��� �ٿ��� key��, ������ value�� �����Ѵ�.
	*/
	}
	
	int getPoint(Player p){
	
		if(p==null)
			return 0;
		SutdaCard2 c1=p.c1;
		SutdaCard2 c2=p.c2;
		
		Integer result=0;
		
		/*
		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		1. ī�� �� ���� ��� ���̸�, jokbo���� Ű�� "KK"�� �ؼ� ������ ��ȸ�Ѵ�.
		2. �� ī���� ����(num)�� jokbo���� ����� ��ȸ�Ѵ�.
		3. �ش��ϴ� ����� ������, �Ʒ��� �������� ������ ����Ѵ�.
		(c1.num + c2.num) % 10 + 1000
		4. Player�� ����(point)�� ����� ���� �����Ѵ�.
		*/
		
		return result.intValue();
		
	}

	
} // SutdaDeck2

class Player {
	String name;
	SutdaCard2 c1;
	SutdaCard2 c2;
	int point; // ī���� ��޿� ���� ���� - ���� �߰�

	Player(String name, SutdaCard2 c1, SutdaCard2 c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	public String toString() {
		return "[" + name + "]" + c1.toString() + "," + c2.toString();
	}
} // class Player

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Practice11_12 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SutdaDeck2 deck = new SutdaDeck2();
		deck.shuffle();
		Player p1 = new Player("Ÿ¥", deck.pick(), deck.pick());
		Player p2 = new Player("���", deck.pick(), deck.pick());
		System.out.println(p1+" "+deck.getPoint(p1));
		System.out.println(p2+" "+deck.getPoint(p2));
	}

}
