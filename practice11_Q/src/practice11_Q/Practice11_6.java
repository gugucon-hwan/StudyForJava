package practice11_Q;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * [11-6] ������ �ڵ�� ��������� �������� �л� ���� ���� ���� ���̴�. TreeSet�� �л����� ����� �������� �����ϵ��� compare(Object o1, Object o2)�� ��������� �������ָ� �ش� ������ ���� �л��� ���� ��ȯ�ϴ� getGroupCount()�� �ϼ��϶�.
 * [Hint] TreeSet�� subSet(Object from, Object to)�� ����϶�.
 * 
 * 
 * [������]
���ڹ�,1,4,70,90,70,230,76.7
���ü�,1,2,90,70,80,240,80.0
���ڹ�,1,3,80,80,90,250,83.3
ȫ�浿,1,1,100,100,100,300,100.0
[60~69] :0
[70~79] :1
[80~89] :2
[90~100] :1
 */
class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
} // class Student

public class Practice11_6 {
	/**
	  * @Method Name : getGroupCount
	  * @�ۼ��� : 2020. 8. 28
	  * @�ۼ��� : gugucon
	  * @�����̷� : 
	  * @Method ���� :
	  * @param tset
	  * @param from
	  * @param to
	  * @return
	  */
	static int getGroupCount(TreeSet tset, int from, int to) {
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		Student2 s1 = new Student2("", 0, 0, from, from, from);
		Student2 s2 = new Student2("", 0, 0, to, to, to);

		return tset.subSet(s1, s2).size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet(new Comparator() {// �͸�Ŭ����
			/**
			  * @Method Name : compare
			  * @�ۼ��� : 2020. 8. 28
			  * @�ۼ��� : gugucon
			  * @�����̷� : 
			  * @Method ���� :
			  * @param o1
			  * @param o2
			  * @return
			  */
			public int compare(Object o1, Object o2) {
				/*
				 * (2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				 */
				if (o1 instanceof Student2 && o2 instanceof Student2) {
					Student2 s1 = (Student2) o1;
					Student2 s2 = (Student2) o2;

					return (int) (s1.getAverage() - s2.getAverage());
				}
				return -1;
			}
		});
		set.add(new Student2("ȫ�浿", 1, 1, 100, 100, 100));
		set.add(new Student2("���ü�", 1, 2, 90, 70, 80));
		set.add(new Student2("���ڹ�", 1, 3, 80, 80, 90));
		set.add(new Student2("���ڹ�", 1, 4, 70, 90, 70));
		set.add(new Student2("���ڹ�", 1, 5, 60, 100, 80));
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}

}
