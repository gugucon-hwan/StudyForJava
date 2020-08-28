package practice11_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * [11-7] ������ ���õ� BanNoAscendingŬ������ �ϼ��Ͽ�, ArrayList�� ��� Student�ν��Ͻ����� ��(ban)�� ��ȣ(no)�� �������� ���ĵǰ� �Ͻÿ�.
 * (���� ���� ��� ��ȣ�� ���ؼ� �����Ѵ�.)
 * 
 * [������]
���ü�,1,1,90,70,80,240,80.0
���ڹ�,1,2,80,80,90,250,83.3
ȫ�浿,1,3,100,100,100,300,100.0
���ڹ�,2,1,70,90,70,230,76.7
���ڹ�,2,2,60,100,80,240,80.0
 * 
 */
class Student3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student3(String name, int ban, int no, int kor, int eng, int math) {
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
} // class Student

class BanNoAscending implements Comparator {
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
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		Student3 stu1 = (Student3)o1;
		Student3 stu2 = (Student3)o2;
		
		if(stu1.ban==stu2.ban)
			return stu1.no-stu2.no;
		
		return (int) stu1.ban-stu2.ban;
	}
}

public class Practice11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student3("���ڹ�",2,1,70,90,70));
		list.add(new Student3("���ڹ�",2,2,60,100,80));
		list.add(new Student3("ȫ�浿",1,3,100,100,100));
		list.add(new Student3("���ü�",1,1,90,70,80));
		list.add(new Student3("���ڹ�",1,2,80,80,90));
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}

}
