package practice9_Q;

import java.util.Scanner;

/*
 * [9-11] Ŀ�ǵ�������� 2~9������ �� ���� ���ڸ� �޾Ƽ� �� ���ڻ����� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� 3�� 5�� �Է��ϸ� 3�ܺ��� 5�ܱ��� ����Ѵ�.
 * 
 */
public class Practice9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ܰ� �� ��, �ְ��� ������ �Է����ּ���.");
		System.out.println("USAGE : GugudanTest ");
		int[] num = new int[2];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();

		for (int i = num[0]; i <= num[1]; i++) {
			if ((i >= 2) && (i <= 9)) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				} // for
			} // if
			System.out.println();
		}
	}

}
/*
class Exercise9_11 {
	public static void main(String[] args) {
		int from = 0;
		int to = 0;
		try {
			if (args.length != 2)
				throw new Exception("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.");
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			if (!(2 <= from && from <= 9 && 2 <= to && to <= 9))
				throw new Exception("���� ������ 2�� 9������ ���̾�� �մϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
// ���� ��(from)�� �� ��(to)���� �۾ƾ��ϴϱ�
// to���� from�� ���� ũ�� �� ���� �ٲ۴�.
		if (from > to) {
			int tmp = from;
			from = to;
			to = tmp;
		}
// from�ܺ��� to�ܱ��� ����Ѵ�.
		for (int i = from; i <= to; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	} // main
}
*/