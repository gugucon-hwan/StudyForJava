package practice7_Q;

/*�������� �ۼ��� : hwan
 * [7-17] �Ʒ� �� ���� Ŭ�����κ��� ����κ��� �̾Ƽ� Unit�̶�� Ŭ������ �����, �� Ŭ������ ��ӹ޵��� �ڵ带 �����Ͻÿ�.
 * 
 * Ŭ�������� �̵��ϴ� ����� �ٸ��Ƿ� move�޼���� �߻�޼���� �����Ͽ���
 */

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		
	}
}

class Marine extends Unit { // ����
	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */ }
	void stimPack() {
		/* �������� ����Ѵ�. */}
}

class Tank extends Unit { // ��ũ
	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */ }
	void changeMode() {
		/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit{ // ���ۼ�
	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */ }
	void load() {
		/* ���õ� ����� �¿��. */ }

	void unload() {
		/* ���õ� ����� ������. */ }
}

public class Practice7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
