package practice13_Q;

import javax.swing.JOptionPane;

public class Practice13_9 {
	public static void main(String[] args) {
		Practice13_9_1 th1 = new Practice13_9_1();
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt(); // �����忡�� �۾��� ���߶�� ��û�Ѵ�.
	}// main
}

class Practice13_9_1 extends Thread {
	public void run() {
		int i = 10;
		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000); // 1�� ����
			} catch (InterruptedException e) {
				interrupt();
			}
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}//