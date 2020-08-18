package practice8_Q;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * [8-8] ������ 1~100������ ���ڸ� ���ߴ� ������ �����ϴ� ���߿� ���ڰ� �ƴ� �����ڸ��־ �߻��� �����̴�. 
 * ����ó���� �ؼ� ���ڰ� �ƴ� ���� �Է����� ���� �ٽ� �Է����޵��� �����϶�.
 * 
 * 1�� 100������ ���� �Է��ϼ��� :50
 * �� ���� ���� �Է��ϼ���.
 * 1�� 100������ ���� �Է��ϼ��� :asdf
 * Exception in thread "main" java.util.InputMismatchException
 * at java.util.Scanner.throwFor(Scanner.java:819)
 * at java.util.Scanner.next(Scanner.java:1431)
 * at java.util.Scanner.nextInt(Scanner.java:2040)
 * at java.util.Scanner.nextInt(Scanner.java:2000)
 * at Exercise8_8.main(Exercise8_8.java:16)
 * 
 * 
 * 
 */

public class Practice8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			try {
			input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e){
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
				continue;
			}
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
				break; // do-while���� �����
			}
		} while (true); // ���ѹݺ���
	}

}
