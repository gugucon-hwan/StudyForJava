package practice11_Q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/*
 * 
 * [11-2] ���� �ڵ��� �������� �����ÿ�.
 * 
 * [11-3] ���� �� ArrayList���� ���� ����� ���� ��� �۾���? ��, �۾����߿� ArrayList�� ũ�� ������ �߻����� �ʴ´ٰ� �����Ѵ�.
a. ù ��° ��� ����
b. ������ ��� ����
c. �������� ���ο� ��� �߰�
d. �߰��� ���ο� ��� �߰�
 * 
 * [����] d
 * 
 * [11-4] LinkedListŬ������ �̸��� �޸� �����δ� ���� ���� ���Ḯ��Ʈ(doubly circular linked list)�� �����Ǿ� �ִ�. LinkedList�ν��Ͻ��� �����ϰ� 11���� ��Ҹ� �߰����� ��, �� 11���� ��� �� ���ٽð�(access time)�� ���� ���� �ɸ��� ��Ҵ� �� ��° ����ΰ�?
 * 
 * [����] ���� ��° ���(LinkedList���� ���� ��� ��ġ�� ���)
 * 
 * LinkedList�� �� ��Ұ� ���� ������ ����Ǿ� �־, n��° ��ҿ� �����ϱ� ��
�ؼ��� ù ��° ��Һ��� ������� �� ��Ҹ� ���ľ� �ȴ�. ���� ��� �� ��° ��ҿ� ��
���ϱ� ���ؼ��� ù ��° ��ҿ��� �� ��° ��ҷ�, �� ��° ��ҿ��� �� ��° ��ҷ� ��
���ؾ� �Ѵ�.

�̷� ���̸� LinkedList�� ������ ��ҿ� �����ϴ� ���� �ð��� ���� ���� �ɸ� �� ����
��, �׷��� ���� ������ LinkedList�� �����δ� �Ʒ��� �׸��� ���� ���� ���� ���Ḯ��
Ʈ�� �Ǿ� �ֱ� �����̴�.

���� ���� ���Ḯ��Ʈ�� ù ��° ��ҿ� ������ ��Ҹ� �����ؼ� LinkedList�� ������ ��
�ټ�(accessibility)�� ����Ų ���̴�. ���� ���� ���Ḯ��Ʈ������ ������ ��ҿ� ��
���ϱ� ���ؼ��� ù ��° ��ҿ��� �� ���� �̵��ϸ� �ȴ�. ������ ��ҿ��� ù ��° ��
�ҿ� �����ϱ� ���ؼ��� ���� �� ���� �̵��ϸ� �ȴ�.
�̰��� ��ġ Tv�������� ù ��° ä�ο��� ä���� ���ҽ�Ű�� ������ ä�η� �̵��ϰ�,
������ ä�ο��� ä���� ������Ű�� ù ��° ä�η� �̵��ϴ� �Ͱ� ���ٰ� �� �� �ִ�.
�׷��� LinkedList�� ���� ��� �ִ� ��Ұ� ���ٽð��� ���� ��ٴ� ���� �� �� ��
��.
 */
/**
  * @FileName : Practice11_2.java
  * @Project : practice11_Q
  * @Date : 2020. 8. 27 
  * @�ۼ��� : gugucon
  * @�����̷� :
  * @���α׷� ���� : HashSet, TreeSet, Stack 
  */
public class Practice11_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		HashSet set = new HashSet(list);//2367
		Iterator<Integer>s=set.iterator();
		while(s.hasNext()) {
			int tmp=s.next();
			System.out.print(tmp);
		}
		System.out.println();
		TreeSet tset = new TreeSet(set);//2367
		Iterator<Integer> t=tset.iterator();
		while(t.hasNext()) {
			int tmp=t.next();
			System.out.print(tmp);
		}
		System.out.println();
		Stack stack = new Stack();
		stack.addAll(tset);
		while(!stack.empty())
		System.out.println(stack.pop());//7632
	}

}
