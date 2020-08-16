package practice7_Q;

/*
 * ����7-1�� ������ ����ī���� ���ڿ� ����(isKwang)�� ��� �ѹ� ���� �����Ǹ� ����Ǿ�� �� �Ǵ� ���̴�. 
 * ī���� ���ڰ� �ѹ� �߸� �ٲ�� �Ȱ��� ī�尡 �� ���� �� �� �� �ֱ� �����̴�. 
 * �̷��� �������� �߻����� �ʵ��� �Ʒ��� SutdaCard�� �����Ͻÿ�.
 * 
 * [�ؼ�] ���� ���� �տ� final�� ���� ���� ����� �ʱ�ȭ�� ���ÿ� �ؾ� �Ѵ�.
 * final int MAX_VOLUME = 100;
 * 
 * �׷��� �ν��Ͻ������� ���, ����ÿ� �ʱ�ȭ ���� �ʰ� �����ڿ��� �ʱ�ȭ�� �� �ִ�.
 * ������ �� ������ ���� ������ �ʵ��� �� �� �ִ� ���̴�. 
 * ����̹Ƿ� �ѹ� �ʱ�ȭ�� ���ķδ� ���� �ٲ� �� ����.
 * ī����ӿ��� ī���� ���ڿ� ���̰� ���ӵ��߿� ����Ǵ� ���� �����ϴٸ�, �Ǽ��� ����ī�尡 �� ���� �Ǵ� ���� �Ͼ �� �ֱ� ������ 
 * �̸� �����ϱ� ���ؼ� ���ڿ� ���̴� �ѹ� �����Ǹ� ������ �� ������ �ϴ� ���� �ٶ����ϴ�.
 * 
 * [7-15] Ŭ������ ������ ���� ���ǵǾ� ���� ��, ����ȯ�� �ùٸ��� ���� ���� ����?(��� ���ÿ�.)
 * 
 * class Unit {}
 * class AirUnit extends Unit {}
 * class GroundUnit extends Unit {}
 * class Tank extends GroundUnit {}
 * class AirCraft extends AirUnit {}
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * AirCraft ac = new AirCraft();
 * 
 * 
 * a. u = (Unit)ac;
 * b. u = ac;
 * c. GroundUnit gu = (GroundUnit)u;
 * d. AirUnit au = ac;
 * e. t = (Tank)u;
 * f. GroundUnit gu = t;
 * 
 * [����] e
 * ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ������ ����ȯ �� �� ����.
 * UnitŬ������ ������ �� �� Ŭ������ �����̹Ƿ� ����ȯ�� �����ϸ�, ������� ������ ���� �ִ�.
 * 
 * AirCraft ac = new AirCraft();
 * u = (Unit)ac; // u�� AirCraft�� ������ UnitŸ���̹Ƿ� ����ȯ�� �����ϴ�.
 * u = ac; // ��ĳ����(�ڼա�����)�̹Ƿ� ����ȯ�� ������ �� �ִ�.
 * 
 * ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� �����ϴ� ���� �����ϱ� ������ �Ʒ��� �ڵ�� ��� �����ϴ�.
 * Unit u = new GroundUnit();
 * GroundUnit gu = (GroundUnit)u; // u�� �����ϴ� ��ü�� GroundUnit�̹Ƿ� OK
 * GroundUnit gu = (GroundUnit)new GroundUnit(); // ���� �� ���� �� �ٷ� ��ħAirCraft ac = new AirCraft();
 * AirUnit au = ac; // AirCraft�� AirUnit�� �ڼ��̹Ƿ� ����. ����ȯ ������
 * AirUnit au = new AirCraft(); // ���� �� ���� �� �ٷ� ��ġ�� �̷��� �� �� ����
 * Tank t = new Tank();
 * GroundUnit gu = t; // ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ����. OK
 * GroundUnit gu = new Tank(); // ���� �� ���� �� �ٷ� ��ġ�� �̷��� �� �� ����
 * 
 * �׷��� �����ν��Ͻ��� �ڼ�Ÿ������ ����ȯ�ϴ� ���� ������� �ʴ´�. �������� u�� ������ GroundUnit�ν��Ͻ��� �����ϰ� �ִ�. 
 * (Tank)u�� GroundUnit�ν��Ͻ��� �ڼ�Ÿ����Tank�� ����ȯ�ϴ� ���ε�, �ڼ�Ÿ������ ����ȯ�� ������ �����Ƿ� ����� ������ �߻��Ѵ�.
 * [����] ������ �ÿ��� Ÿ�Ը��� üũ�ϱ� ������ ������ �߻����� ���� ���� ������, ����ÿ� ������ �߻��Ѵ�.
 * 
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * t = (Tank)u; // �����ν��Ͻ�(GroundUnit)�� �ڼ�(Tank)���� ����ȯ�� �� ����.
 * Tank t = (Tank)new GroundUnit; // ������ ����
 * 
 * [7-16] ���� �� �������� true�� �ƴ� ����? (��� ���ÿ�)
 * class Car {}
 * class FireEngine extends Car implements Movable {}
 * class Ambulance extends Car {}
 * FireEngine fe = new FireEngine();
 * 
 * a. fe instanceof FireEngine
 * b. fe instanceof Movable
 * c. fe instanceof Object
 * d. fe instanceof Car
 * e. fe instanceof Ambulance
 * 
 * [����] e
 * instanceof�����ڴ� ���� �ν��Ͻ��� ��� �����̳� ������ �������̽��� ����true�� ��ȯ�Ѵ�. 
 * �׷���, �Ʒ� �׸����� �� �� �ֵ��� FireEngine�ν��Ͻ��� Object,Car, Movable, FireEngineŸ�Կ� ���� instanceof������ �ϸ� ����� true�� ��´�. 
 * � Ÿ�Կ� ���� instanceof�������� true��� ���� �� Ÿ������ ����ȯ�� �����ϴٴ°��� ���Ѵ�. 
 * ���������� ����ȯ�� �ϱ⿡ �ռ� instanceof�����ڷ� ����ȯ�� ���������̸� Ȯ���� ���� ���� ����.
 * 
 * 
 */

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Practice7_14_15_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card = new SutdaCard(1, true);
		System.out.println(card);
	}
}
