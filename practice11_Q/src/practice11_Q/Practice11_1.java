package practice11_Q;

import java.util.ArrayList;

/*
 * 
 * [11-1] ������ �������� 1,2,3,4�� 3,4,5,6�� ������, ������, �������� ���ϴ� �ڵ��̴�. 
 * �ڵ带 �ϼ��Ͽ� �������� ���� ����� ����Ͻÿ�.
 * [Hint] ArrayListŬ������ addAll(), removeAll(), retainAll()�� ����϶�.
 * 
 * [������]
list1=[1, 2, 3, 4]
list2=[3, 4, 5, 6]
kyo=[3, 4]
cha=[1, 2]
hap=[1, 2, 3, 4, 5, 6]
 */
public class Practice11_1 {

	/**
	  * @Method Name : main
	  * @�ۼ��� : 2020. 8. 26
	  * @�ۼ��� : gugucon
	  * @�����̷� : 
	  * @Method ���� : ������, ������, �������� ���ϴ� �ڵ�(addAll()(��), removeAll()(��), retainAll()(��))
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // ������
		ArrayList cha = new ArrayList(); // ������
		ArrayList hap = new ArrayList(); // ������
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		ArrayList tmp= new ArrayList();
				
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		tmp.addAll(list2);
		tmp.removeAll(list1);		
		hap.addAll(list1);
		hap.addAll(tmp);		
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}

}
