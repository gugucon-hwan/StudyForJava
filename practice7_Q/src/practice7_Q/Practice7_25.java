package practice7_Q;

/* �������� �ۼ��� : hwan
 * [7-25] OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�.
 * 
 * [������]
 * 100
 * 
 */

class Outer {
	class Inner {
		int iv = 100;
	}	
}

public class Practice7_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		Outer o=new Outer();
		Outer.Inner in=o. new Inner();
		System.out.println(in.iv);		
	}

}
