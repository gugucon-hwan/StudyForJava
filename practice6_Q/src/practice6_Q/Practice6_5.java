package practice6_Q;

/*���δ� �ۼ��� : hwan
 * [6-5] ������ ���� �������� �򵵷� StudentŬ������ �����ڿ� info()�� �߰��Ͻÿ�.
 * 
 * [������]
 * ȫ�浿,1,1,100,60,76,236,78.7
 */

public class Practice6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		System.out.println(s.info());
	}

}
class Student {
/*���δ� �ۼ��� : hwan
(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
*/
	String name;//�л��̸�
	int ban;		//��
	int no;		//��ȣ
	int kor;		//��������
	int eng;		//��������
	int math;	//��������
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;		
	}
	
	public String info() {
		int sum=kor+eng+math;
		float avr=Math.round((float)(kor+eng+math)/3*10f+0.5f)/10f;		
		
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+sum+", "+avr;		
	}	
}