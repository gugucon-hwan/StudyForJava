package practice7_Q;

/*�������� �ۼ��� : hwan
 * [7-20] ������ �ڵ带 ������ ����� �����ÿ�.
 * 
 * [������]
 * p.x = 100
 * Child Method
 * c.x = 200
 * Child Method
 * 
 * 
 * 
 * [�ؼ�] ���� Ŭ������ ����� ��������� ���� �̸��� �ν��Ͻ������� �ڼ� Ŭ������ �ߺ����� �������� ��, 
 * ����Ÿ���� ���������� �ڼ� �ν��Ͻ��� �����ϴ� ���� �ڼ�Ÿ���� ���������� �ڼ� �ν��Ͻ��� �����ϴ� ���� ���� �ٸ� ����� ��´�.
 * �޼����� ��� ���� Ŭ������ �޼��带 �ڼ��� Ŭ�������� �������̵��� ��쿡�� ���������� Ÿ�Կ� ������� �׻� ���� �ν��Ͻ��� �޼���(�������̵��� �޼���)�� ȣ�������,
 * ��������� ��� ���������� Ÿ�Կ� ���� �޶�����.
 * 
 * �׸���, ParentŬ������ ChildŬ������ ���� ���� ������� �����ϰ� �ִ�
 * �� �� ����Ÿ���� �������� p�� Child�ν��Ͻ��� ������� ����ϴ� �Ͱ� �ڼ�Ÿ���� �������� c�� Child�ν��Ͻ��� ������� ����ϴ� ���� ���̸� �� �� �ִ�.�޼����� method()�� ��� ���������� Ÿ�Կ� ������� �׻� ���� �ν��Ͻ��� Ÿ����
 * ChildŬ������ ���ǵ� �޼��尡 ȣ�������, �ν��Ͻ������� x�� ���������� Ÿ�Կ� ���� �޶�����.
 * 
 */

public class Practice7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}