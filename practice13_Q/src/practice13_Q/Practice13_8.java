package practice13_Q;

import java.util.Scanner;
import java.util.Vector;

public class Practice13_8 {
	Vector words = new Vector();
	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
	int interval = 2 * 1000; // 2��
	WordGenerator wg = new WordGenerator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice13_8 game = new Practice13_8();
		game.wg.start();// �ܾ �����ϴ� �����带 �����Ų��.
		Vector words = game.words;
		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);// �Է¹��� �ܾ words���� ã�´�.
			if (index != -1) {// ã����
				words.remove(index);// words���� �ش� �ܾ �����Ѵ�.
			}
		}
	}
	class WordGenerator extends Thread {
		public void run() {
			/*
			 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 1. interval(2��)���� �迭 data�� �� �� �ϳ��� ���Ƿ� �����ؼ� 2.*
			 * words�� �����Ѵ�.
			 */
			while (true) {
				// 1. interval(2��)���� �迭 data�� �� �� �ϳ��� ���Ƿ� �����ؼ�
				int rand = (int) (Math.random() * data.length);
				// 2. words�� �����Ѵ�.
				words.add(data[rand]);
				try {
					Thread.sleep(interval); // 2��(interval) ���� ����.
				} catch (Exception e) {
				}
			}//while

		} // end of run()
	} // class WordGenerator
}//Practice13_8

