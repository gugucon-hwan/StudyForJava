package practice6_Q;

/*���δ� �ۼ��� : hwan
 * [6-8] ������ �ڵ忡 ���ǵ� �������� �������� �����ؼ� �����ÿ�.
 * 
 * - Ŭ��������(static����) : width, height
 * - �ν��Ͻ����� : kind, num
 * - �������� : k, n, card, args
 */

/*
class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;

	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}

	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}*/

public class Practice6_8 {
	int kind;
	int num;
	static int width;
	static int height;

	Practice6_8(int k, int n) {
		kind = k;
		num = n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6_8 card = new Practice6_8(1, 1);		
	}

}
