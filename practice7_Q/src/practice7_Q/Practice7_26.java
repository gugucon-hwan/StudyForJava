package practice7_Q;

/* �������� �ۼ��� : hwan
 * [7-26] OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�.
 * 
 * 
 * [������]
 * 200
 * 
 */

class Outer2 {
	static class Inner2 {
		int iv = 200;
	}
}

public class Practice7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */		
		Outer2.Inner2 in=new Outer2.Inner2();
		System.out.println(in.iv);
	}
}
