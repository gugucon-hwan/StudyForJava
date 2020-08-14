package practice6_Q;

/*
 * [6-17] ȣ�⽺���� ������ ���� ��Ȳ�� �� ���� ���� ������? (��� ���ÿ�)
 * ----println----
 *    method1
 *    method2
 *    main
 * a. ���� ���� ȣ�⽺�ÿ� ����� ���� main�޼����̴�.
 * b. println�޼��带 ������ ������ �޼������ ��� ����� �����̴�.
 * c. method2�޼��带 ȣ���� ���� main�޼����̴�.
 * d. println�޼��尡 ����Ǹ� method1�޼��尡 ������ �簳�Ѵ�.
 * e. main-method2-method1-println�� ������ ȣ��Ǿ���.
 * f. ���� �������� �޼���� println ���̴�.
 * 
 * ���� : b
 *  ȣ�⽺���� ���� ���� �ִ� �޼��尡 ���� �������� �޼����̸�, 
 *  ȣ�⽺�� ���� ������ �޼������ �������̴�.
 * 
 * 
 * [6-18] ������ �ڵ带 �������ϸ� ������ �߻��Ѵ�. 
 * ������ ������ �߻��ϴ� ���ΰ� �� ������ �����Ͻÿ�.  
class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = iv; // ���� A

	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); // ���� B
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // ���� C
	}

static void staticMethod2() {
staticMethod1();
instanceMethod1(); // ���� D
}

void instanceMethod2() {
staticMethod1(); // ���� E
instanceMethod1();
*
*���� : ���� a, b, d
*���� A - static������ �ʱ�ȭ�� �ν��Ͻ������� ����� �� ����.
*�� ����ؾ��Ѵٸ�, ��ü�� �����ؾ��Ѵ�.
*���� B - static�޼��忡���� �ν��Ͻ������� ����� �� ����.
*���� D - static�޼��忡���� �ν��Ͻ��޼��带 ����� �� ����.
*
*[6-19] ���� �ڵ��� ���� ����� �����Ͽ� �����ÿ�.
*
*class Exercise6_19
{
public static void change(String str) {
str += "456";
}
public static void main(String[] args)
{
String str = "ABC123";
System.out.println(str);
change(str);
System.out.println("After change:"+str);
}
}
*���� : 
*ABC123
*ABC123
*change�޼����� �Ű������� �������ε��� ��? main�޼����� ���ڿ� str�� ������
*������ �ݿ����� ���� ���ϱ�? ���� ������� �Ű������� �������̶�� �͸� ���� 
*main�޼����� ���ڿ� str�� ����� ���̶�� ���� �����Ѵ�. 
*
*
*/




public class Practice6_17_19 {
	public static void change(StringBuffer str) {
		str.append("456");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("ABC123");
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}

}
