package practice6_Q;

/* ���δ� �ۼ��� : hwan
 * [6-4] ����6-3���� ������ StudentŬ������ ������ ���� ���ǵ� 
 * �� ���� �޼��� getTotal()�� getAverage()�� �߰��Ͻÿ�.
 * 
 * 1. �޼���� : getTotal 
 * �� �� : ����(kor), ����(eng), ����(math)�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : ����
 * 
 * 2. �޼���� : getAverage
 * �� �� : ����(��������+��������+��������)�� ������� ���� ����� ���Ѵ�.
 * �Ҽ��� ��°�ڸ����� �ݿø��� ��.
 * ��ȯŸ�� : float
 * �Ű����� : ����
 * 
 * [������]
	�̸�:ȫ�浿
	����:236
	���:78.7
 */

public class Practice6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}

}
class Student2{
	String name;//�л��̸�
	int ban;		//��
	int no;		//��ȣ
	int kor;		//��������
	int eng;		//��������
	int math;	//��������
	
	public int getTotal() {		
		return kor+eng+math;
	}
	
	public float getAverage() {		
		return Math.round(((float)(kor+eng+math)/3)*10f+0.5f)/10.0f;
	}
	/*
	 * float getAverage() {
	 * return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	 * }
	 */
}