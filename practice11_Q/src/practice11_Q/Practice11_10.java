package practice11_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * [11-10] ���� ������ �������� 1~30������ ���ڵ�� ���� ���ε�, ���ڵ��� ��ġ�� �߼����� �ʴ´ٴ� ������ �ִ�. 
 * �̷��� ������ �߻��ϴ� ������ �� ������ �����ϱ� ���� ����� �����ϰ�, �̸� ������ ���ο� �ڵ带 �ۼ��Ͻÿ�.
 * 
 * 
 * [����] HashSet�� �ߺ��� ������� �ʰ� ������ �������� �ʱ� ������ �߻��ϴ� �����̴�. �ƹ��� ������ ������ ������ �ص�, 
 * �ؽ�(hashing) �˰����� Ư���� �� ���ڰ� ������ ��ġ�� ����Ǳ� �����̴�.
�� ������ �ذ��ϱ� ���ؼ��� ��������� �����ϴ� List�������̽��� 
������ �÷��� Ŭ������ ����ϵ��� �����ؾ� �Ѵ�.
 */
public class Practice11_10 {

	/**
	  * @Method Name : main
	  * @�ۼ��� : 2020. 8. 29
	  * @�ۼ��� : gugucon
	  * @�����̷� : 
	  * @Method ���� : 1~30������ ���ڷ� ������ �����
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list);
		Iterator it = list.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}		
	}//main

}
