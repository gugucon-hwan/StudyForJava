package practice13_Q;

public class Practice13_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1 = new Thread2();
		t1.run();
		for (int i = 0; i < 10; i++)
			System.out.print(i);
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.print(i);
	}
}