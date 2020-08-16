package practice7_Q;

/*
 * [7-9] ���� �� ������ final�� ���� �� �ִ� ���� �ٿ��� �� �� �ǹ̸� ���� ���̴�.
 * ���� ���� ����? (��� ���ÿ�)
 * a. �������� - ���� ������ �� ����.
 * b. Ŭ���� - ����� ���� Ŭ������ ���ο� ����� �߰��� �� ����.
 * c. �޼��� - �����ε��� �� �� ����.
 * d. ������� - ���� ������ �� ����.
 * 
 * [����] c
 * [�ؼ�] ������ final�� '��������' �Ǵ� '����� �� ����'�� �ǹ̸� ������ ������ 
 * ���Ǹ�� ��� ���� �� �ִ�.
 * 
 * 
 * 
 * [7-10] MyTv2Ŭ������ ������� isPowerOn, channel, volume�� Ŭ���� �ܺο��� �����Ҽ� ������ �����ڸ� ���̰� 
 * ��� �� ����������� ���� ��𼭳� �а� ������ �� �ֵ��� 
 * getter�� setter�޼��带 �߰��϶�.
 * 
 * [������]
 * CH:10
 * VOL:20 
 */

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	/*
	 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
	 */
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		this.channel = channel;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
}

public class Practice7_9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
