package practice7_Q;

/*
 * [7-11] ����7-10���� �ۼ��� MyTv2Ŭ������ ���� ä��(previous channel)�� �̵��ϴ� 
 * ����� �޼��带 �߰��ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
 * [Hint] ���� ä���� ���� ������ ��������� �����϶�.
 * �޼���� : gotoPrevChannel
 * �� �� : ���� ä���� ���� ä�η� �����Ѵ�.
 * ��ȯŸ�� : ����
 * �Ű����� : ����
 *
 * [������]
 * CH:10
 * CH:20
 * CH:10
 * CH:20
 * 
 * [7-12] ���� �� ���� �����ڿ� ���� �������� ���� ���� ����? (��� ���ÿ�)
 * a. public�� ���������� ���� ���� ���� �������̴�.
 * b. (default)�� ������, ���� ��Ű�� �������� ������ �����ϴ�.
 * c. ������������ ���� �����ڸ� ����� �� �ִ�.
 * d. protected�� ������, ���� ��Ű�� �������� ������ �����ϴ�.
 * e. protected�� ������, �ٸ� ��Ű���� �ڼ� Ŭ�������� ������ �����ϴ�.
 * 
 * [����] ���� ����
 * ���� �����ڰ� ���� �� �ִ� �� - Ŭ����, �������, �޼���, ������
 * private - ���� Ŭ���� �������� ������ �����ϴ�.
 * default - ���� ��Ű�� �������� ������ �����ϴ�.
 * protected - ���� ��Ű�� ������, �׸��� �ٸ� ��Ű���� �ڼ�Ŭ�������� ������ �����ϴ�.
 * public - ���� ������ ���� ����.
 * 
 * [7-13] MathŬ������ �����ڴ� ���� �����ڰ� private�̴�. �� ������ �����ΰ�?
 * [����] 
 * MathŬ������ ��� �޼��尡 static�޼����̰� �ν��Ͻ������� �������� �ʱ� ������ ��ü�� ������ �ʿ䰡 ���� ����
 * 
 * [�ؼ�] MathŬ������ �� ���� ����� static�޼��常���� �����Ǿ� �ֱ� ������ �ν��Ͻ��� ������ �ʿ䰡 ����. 
 * �׷��� �ܺηκ����� ���ʿ��� ������ ���� ���� ������ ���� �������� ���� �����ڸ� private���� �����Ͽ���.
 * 
 */
class MyTv3 {
	/*
	 * (1) ����7-10�� MyTv2Ŭ������ gotoPrevChannel�޼��带 �߰��Ͽ� �ϼ��Ͻÿ�.
	 */
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	

	/*
	 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
	 */
	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel=this.channel;
		this.channel = channel;		
	}

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;		
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	void gotoPrevChannel() {
		setChannel(prevChannel);		
	}
}

public class Practice7_11_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv3 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
