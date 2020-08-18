package practice8_Q;

public class Practice8_1_2_3_4_5_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * [8-1] ����ó���� ���ǿ� ������ ���ؼ� �����Ͻÿ�
 * 
 * [����] ���� - ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� �ڵ带 �ۼ��ϴ� �� ���� - ���α׷��� ������ ���Ḧ ����,
 * �������� ������¸� �����ϴ� ��
 * 
 * [�ؼ�] ���α׷��� ���൵�߿� �߻��ϴ� ������ ��¿ �� ������, ���ܴ� ���α׷��Ӱ� �̿� ���� ó���� �̸� ���־�� �Ѵ�.
 * 
 * ����(error) - ���α׷� �ڵ忡 ���ؼ� ������ �� ���� �ɰ��� ���� ����(exception) - ���α׷� �ڵ忡 ���ؼ� ������ ��
 * �ִ� �ټ� �̾��� ����
 * 
 * ����ó��(exception handling)��, ���α׷� ���� �� �߻��� �� �ִ� ����ġ ���� �����ǹ߻��� ����� �ڵ带 �ۼ��ϴ� ���̸�,
 * ����ó���� ������ ������ �߻����� ���� �������� ���α׷��� ���۽��� ������ ���Ḧ ����, �������� ������¸� ������ �� �ֵ����ϴ� ���̴�.
 * 
 * ����ó��(exception handling)�� ���� - ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� �ڵ带 �ۼ��ϴ� �� ���� -
 * ���α׷��� ������ ���Ḧ ����, �������� ������¸� �����ϴ� ��
 * 
 * [8-2] ������ ���൵�� ���ܰ� �߻��Ͽ� ȭ�鿡 ��µ� �����̴�. �̿� ���� ���� �� ���� ���� ����?
 * 
 * java.lang.ArithmeticException : / by zero at
 * ExceptionEx18.method2(ExceptionEx18.java:12) at
 * ExceptionEx18.method1(ExceptionEx18.java:8) at
 * ExceptionEx18.main(ExceptionEx18.java:4)
 * 
 * a. ���� �������� ���ܰ� �߻����� ��� ȣ�⽺�ÿ� �����ߴ� �޼��带 �� �� �ִ�. b. ���ܰ� �߻��� ��ġ�� method2 �޼����̸�,
 * ExceptionEx18.java������ 12��° ���̴�. c. �߻��� ���ܴ� ArithmeticException�̸�, 0���� �����
 * ���ܰ� �߻��ߴ�. d. method2�޼��尡 method1�޼��带 ȣ���Ͽ��� �� ��ġ�� ExceptionEx18.java������ 8��°
 * ���̴�.
 * 
 * [����] d [�ؼ�] ������ ������ ArithmeticException�̰� 0���� ������ �߻��Ͽ���. ���ܰ� �߻��Ѱ��� method2�̰�
 * ExceptionEx18.java�� 12��° ���̴�. ���ܰ� �߻����� ����� ȣ�⽺���� ���� �Ʒ��� �׸��� ����. ȣ�⽺���� �� ���� �ִ�
 * �޼��尡 ���� ���� ���� �޼����̰� �Ʒ� �ִ� �޼��尡 �ٷ� ���� �޼��带 ȣ���� ���̴�. �׷��� main �� method1��
 * method2�� ������ ȣ��Ǿ����� �� �� �ִ�.
 * 
 * [8-3] ���� �� �������̵��� �߸��� ����? (��� ���ÿ�)
 * 
 * void add(int a, int b) throws InvalidNumberException, NotANumberException {}
 * class NumberException extends Exception {} class InvalidNumberException
 * extends NumberException {} class NotANumberException extends NumberException
 * {}
 * 
 * a. void add(int a, int b) throws InvalidNumberException, NotANumberException
 * {} b. void add(int a, int b) throws InvalidNumberException {} c. void add(int
 * a, int b) throws NotANumberException {} d. void add(int a, int b) throws
 * Exception {} e. void add(int a, int b) throws NumberException {}
 * 
 * [����] d, e [�ؼ�] �������̵�(overriding)�� �� ��, ���� Ŭ������ �޼��庸�� ���� ���� ���ܸ� ������ �� ����. -
 * �Ʒ��� �ڵ带 ���� ChildŬ������ parentMethod()�� ����� ������ ������ ������ ParentŬ������
 * parentMethod()�� ����� ������ �������� �����Ƿ� �ٸ��� �������̵� �Ǿ���.
 * 
 * Class Parent { void parentMethod() throws IOException, SQLException { //.. }
 * } Class Child extends Parent { void parentMethod() throws IOException { //..
 * } //.. }
 *
 * ���⼭ �����ؾ��� ���� �ܼ��� ����� ������ ������ ������ �ƴ϶�� ���̴�.
 *
 * Class Child extends Parent { void parentMethod() throws Exception { //.. }/
 * /.. }
 *
 * ���� ���� ���� �������̵��� �Ͽ��ٸ�, �и��� ����Ŭ������ ���ǵ� �޼��庸�� ���� ������ ���ܸ� ������ ��ó�� �������� Exception��
 * ��� ������ �ְ� �����̹Ƿ� ���� ���� ������ ���ܸ� ���� �� �ֵ��� ������ ���̴�. �׷��� ������ ������ ���ų� ���ƾ� �Ѵٴ� ������
 * ������Ű�� ���ϴ� �߸��� �������̵��� ���̴�.
 *
 *
 *
 * [8-4] ������ ���� �޼��尡 ���� ��, ���ܸ� �߸� ó���� ����? (��� ���ÿ�)
 *
 * void method() throws InvalidNumberException, NotANumberException {} class
 * NumberException extends RuntimeException {} class InvalidNumberException
 * extends NumberException {} class NotANumberException extends NumberException
 * {}
 *
 * a. try {method();} catch(Exception e) {} b. try {method();}
 * catch(NumberException e) {} catch(Exception e) {} c. try {method();}
 * catch(Exception e) {} catch(NumberException e) {} d. try {method();}
 * catch(InvalidNumberException e) {} catch(NotANumberException e) {} e. try
 * {method();} catch(NumberException e) {} f. try {method();}
 * catch(RuntimeException e) {}
 *
 * [����] c
 *
 * [�ؼ�] try�� ������ ���ܰ� �߻��ϸ�, catch�� �߿��� ���ܸ� ó���� �� �ִ� ������ ���ʴ�� ã�� ��������. �߻��� ������
 * ������ ��ġ�ϴ� catch���� ������ �� ���� ������� �����ϰ� try-catch���� ����������. ��ġ�ϴ� catch���� ������
 * ���ܴ�ó������ �ʴ´�. �߻��� ������ ������ ��ġ�ϴ� catch���� ã�� ��, instanceof�� �˻縦 �ϱ� ������ ��� ������
 * �ְ������� Exception�� ����� catch���� ��� ���ܸ� �� ó���� �� �ִ�. �� ���� ������ ���� Exception�� ó���ϴ�
 * catch���� ��� catch�� �� ���� �������� �־�� �Ѵٴ� ���̴�.
 *
 * try { method(); } catch(Exception e) { // ������ ���� �߻�!!! }
 * catch(NumberException e) {}
 *
 * ���� �ڵ忡���� Exception�� ������ catch���� ������ catch���� �ƴϱ� ������ ������ ������ �߻��Ѵ�.
 *
 * [8-5] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
 *
 * class Exercise8_5 { static void method(boolean b) { try {
 * System.out.println(1); if (b) throw new ArithmeticException();
 * System.out.println(2); // ���ܰ� �߻��ϸ� ������� �ʴ� ���� } catch (RuntimeException r) {
 * System.out.println(3); return; // �޼��带 ����������.(finally���� ������ �Ŀ�) } catch
 * (Exception e) { System.out.println(4); return; } finally {
 * System.out.println(5); // ���ܹ߻����ο� ������� �׻� ����Ǵ� ���� } System.out.println(6); }
 * 
 * public static void main(String[] args) { method(true); method(false); } //
 * main }
 *
 * [����] [������] 1 3 5 1 2 5 6
 *
 * [�ؼ�] ���ܰ� �߻��ϸ� 1,3,5�� ��µǰ� ���ܰ� �߻����� ������, 1,2,5,6�� ��µȴ�. ArithmeticException��
 * RuntimeException�� �ڼ��̹Ƿ� RuntimeException�� ���ǵ� catch������ ó���ȴ�. �� catch����
 * return���� �����Ƿ� �޼��带 �����ϰ� ���������� �Ǵµ�, �� ���� finally���� ����ȴ�.
 *
 *
 * [8-6] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
 *
 * class Exercise8_6 { public static void main(String[] args) { try { method1();
 * } catch (Exception e) { System.out.println(5); } }
 * 
 * static void method1() { try { method2(); System.out.println(1); } catch
 * (ArithmeticException e) { System.out.println(2); } finally {
 * System.out.println(3); } System.out.println(4); } // method1()
 * 
 * static void method2() { throw new NullPointerException(); } }
 *
 * [����] [������] 3 5
 *
 *
 * [�ؼ�] main�޼��尡 method1()�� ȣ���ϰ�, method1()�� method2()�� ȣ���Ѵ�. method2()����
 * NullPointerException�� �߻��ߴµ�, �� ���ܸ� ó������ try-catch���� �����Ƿ� method2()�� ����ǰ�, �̸�
 * ȣ���� method1()���� �ǵ��ư��µ� ���⿡�� try-catch���� �ֱ� ������ NullPointerException�� ó������
 * catch���� �����Ƿ� method1()�� ����ǰ�, �̸� ȣ���� main�޼���� ���ư���. �� �� finally���� ����Ǿ� '3'��
 * ��µȴ�. main�޼��忡���� ��� ���ܸ� ó���� �� �ִ� Exception�� ����� catch���� �����Ƿ� ���ܰ� ó���ǰ� '5'��
 * ��µȴ�.
 *
 *
 * [8-7] �Ʒ��� �ڵ尡 ����Ǿ��� ���� �������� �����ÿ�.
 *
 *class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				System.exit(0);
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	} // main
}
 *
 *[����]
 *[���� ���]
 *1
 *
 *[�ؼ�] ���� b�� ���� true�̹Ƿ� System.exit(0);�� ����Ǿ� ���α׷��� ��� ����ȴ�. 
 *�̷� ���� finally���� ������� �ʴ´�.
 *
 *
 *
 */


//Exception �������̵� �׽�Ʈ 
class NumberException extends Exception {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

class Parent {
	int a;
	int b;

	Parent() {
		this(0, 0);
	}

	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}
}

class Child extends Parent {
	Child() {
	}

	Child(int a, int b) {
		super(a, b);
	}

	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}
}
