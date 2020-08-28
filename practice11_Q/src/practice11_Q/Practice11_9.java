package practice11_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * [11-9] ����11-8�� StudentŬ������ �ݵ��(classRank)�� �����ϱ� ���� �ν��Ͻ������� �߰��Ͽ���. 
 * �ݵ���� ����ϰ� �ݰ� �ݵ���� �������� �����Ͽ� ����� ����Ͻÿ�.
 * (1)~(2)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
 * 
 * [������]
ȫ�浿,1,3,100,100,100,300,100.0,1,1
���ڹ�,1,2,80,80,90,250,83.3,2,2
���ü�,1,1,90,70,80,240,80.0,3,3
���ڹ�,2,2,60,100,80,240,80.0,3,1
���ڹ�,2,1,70,90,70,230,76.7,5,2
 */

class Student5 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // �������
	int classRank; // �ݵ��

	Student5(String name, int ban, int no, int kor, int eng, int math) {
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
		if (o instanceof Student5) {
			Student5 tmp = (Student5) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getAverage() + "," + schoolRank
				+ "," + classRank // �����߰�
		;
	}
} // class Student

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		
		
	}
}

public class Practice11_9 {
	public static void calculateClassRank(List list) {
		// ���� �ݺ� �������� ������������ �����Ѵ�.
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		/*
		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		1. �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�.
		1.1 ���� �޶�����,(ban�� prevBan�� �ٸ���)
		���� ���(prevRank)�� ���� ����(prevTotal)�� �ʱ�ȭ�Ѵ�.
		1.2 ����(total)�� ��������(prevTotal)�� ������
		���� ���(prevRank)�� ���(classRank)�� �Ѵ�.
		1.3 ������ ���� �ٸ���,
		���(classRank)�� ���� �˸°� ����ؼ� �����Ѵ�.
		������ �����ڿ��ٸ�, �� ���� ����� �������� ���� ����ؾ� �Ѵ�.
		(������ ����)
		1.4 ���� �ݰ� ������ ����� ���� ��(prevBan),
		���� ����(prevTotal), ���� ���(prevRank)�� �����Ѵ�.
		*/
		
		
		} // public static void calculateClassRank(List list) {
		public static void calculateSchoolRank(List list) {
		/* ���� ���� */
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student("���ڹ�",2,1,70,90,70));
		list.add(new Student("���ڹ�",2,2,60,100,80));
		list.add(new Student("ȫ�浿",1,3,100,100,100));
		list.add(new Student("���ü�",1,1,90,70,80));
		list.add(new Student("���ڹ�",1,2,80,80,90));
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
	}

}
