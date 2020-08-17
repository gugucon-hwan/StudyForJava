package practice7_Q;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * [7-28] �Ʒ��� EventHandler�� �͸� Ŭ����(anonymous class)�� �����Ͻÿ�.
 * 
 * [7-29] ���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� ����� static����� ��� ������ ��������, 
 * ���������� final�� ���� ����� ������ �� �ִ� ���� �����ΰ�?
 * 
 * [����] �޼��尡 ������ ���ļ� ���������� �Ҹ�� ��������, 
 * ���� Ŭ������ �ν��Ͻ����Ҹ�� ���������� �����Ϸ��� ��찡 �߻��� �� �ֱ� �����̴�.
 * 
 */

public class Practice7_28_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}

}
/*
class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}*/