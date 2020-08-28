package practice11_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * [11-8] ����11-7�� StudentŬ������ ����(total)�� �������(schoolRank)�� �����ϱ� ���� �ν��Ͻ������� �߰��Ͽ���. 
 * StudentŬ������ �⺻������ �̸�(name)�� �ƴ� ����(total)�� �������� �� ������������ ������ ����, ������ �������� 
 * �� �л��� ��������� ����ϰ� ��������� �������� �������� �����Ͽ� ����Ͻÿ�.
 * 
 * [������]
ȫ�浿,1,3,100,100,100,300,100.0,1
���ڹ�,1,2,80,80,90,250,83.3,2
���ڹ�,2,2,60,100,80,240,80.0,3
���ü�,1,1,90,70,80,240,80.0,3
���ڹ�,2,1,70,90,70,230,76.7,5
 */
class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // ����
	int schoolRank; // �������

	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		if(o instanceof Student4) {
			Student4 tmp=(Student4)o;
			return tmp.total-this.total; //���� ����(��������)���� �����Ѵ�.
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank // �����߰�
		;
	}
} // class Student

public class Practice11_8 {
	/**
	  * @Method Name : calculateSchoolRank
	  * @�ۼ��� : 2020. 8. 28
	  * @�ۼ��� : gugucon
	  * @�����̷� : 
	  * @Method ���� :
	  * @param list
	  */
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�.
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		/*
		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		1. �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�.
		1.1 ����(total)�� ��������(prevTotal)�� ������
		���� ���(prevRank)�� ���(schoolRank)�� �Ѵ�.
		1.2 ������ ���� �ٸ���,
		���(schoolRank)�� ���� �˸°� ����ؼ� �����Ѵ�.
		������ ������ ���ٸ�, �� ���� ����� �������� ���� ����ؾ� �Ѵ�.
		(������ ����)
		1.3 ���� ������ ����� ��������(prevTotal)�� �������(prevRank)��
		�����Ѵ�.
		*/
		
		// 1. �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�.
		for(int i=0;i<list.size();i++) {
			Student4 s= (Student4)list.get(i);
			
			// 1.1 ����(total)�� ��������(prevTotal)�� ������
			// ���� ���(prevRank)�� ���(schoolRank)�� �Ѵ�.			
			if(s.total==prevTotal) {
				s.schoolRank=prevRank;
			}
			//1.2 ������ ���� �ٸ���,
			//���(schoolRank)�� ���� �˸°� ����ؼ� �����Ѵ�.
			//������ ������ ���ٸ�, �� ���� ����� �������� ���� ����ؾ� �Ѵ�.
			//(������ ����)
			else
					s.schoolRank=i+1;
			
			
			// 1.3 ���� ������ ����� ��������(prevTotal)�� �������(prevRank)�� �����Ѵ�.
			prevTotal=s.total;
			prevRank=s.schoolRank;
		}//for	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student4("���ڹ�",2,1,70,90,70));
		list.add(new Student4("���ڹ�",2,2,60,100,80));
		list.add(new Student4("ȫ�浿",1,3,100,100,100));
		list.add(new Student4("���ü�",1,1,90,70,80));
		list.add(new Student4("���ڹ�",1,2,80,80,90));
		calculateSchoolRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}

}
