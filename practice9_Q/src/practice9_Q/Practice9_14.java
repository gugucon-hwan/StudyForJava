package practice9_Q;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * [9-14] ������ ȭ�����κ��� ��ȭ��ȣ�� �Ϻθ� �Է¹޾� ��ġ�ϴ� ��ȭ��ȣ�� �־��� ���ڿ� �迭���� ã�Ƽ� ����ϴ� ���α׷��̴�. �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
 * [Hint] Pattern, MatcherŬ������ ����� ��
 * 
 * 
 * [������]
 * >>
 * >>
 * >>asdf
 * ��ġ�ϴ� ��ȣ�� �����ϴ�.
 * >>
 * >>
 * >>0
 * [012-3456-7890, 099-2456-7980, 088-2346-9870, 013-3456-7890]
 * >>234
 * [012-3456-7890, 088-2346-9870]
 * >>7890
 * [012-3456-7890, 013-3456-7890]
 * >>q
 */
public class Practice9_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			/*
			 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			 */
			String pattern =".*"+input+".*";//input�� �����ϴ� ��� ���ڿ�
			Pattern p=Pattern.compile(pattern);//compile(String regex) : �־��� ����ǥ�������κ��� ������ ����ϴ�.
			
			for(int i=0;i<phoneNumArr.length;i++) {
				String phoneNum=phoneNumArr[i];
				String tmp=phoneNum.replace("-", "");// phoneNum���� '-'�� ����
				
				Matcher m= p.matcher(tmp);
				if(m.find()) {// ���ϰ� ��ġ�ϸ�, list�� phoneNum�� �߰��Ѵ�.
					list.add(phoneNum);
				}
			}
			
			if (list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
		}//while
	}//main

}
