package practice10_Q;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * [10-4] ȭ�����κ��� ��¥�� ��2007/05/11���� ���·� �Է¹޾Ƽ� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, �Էµ� ��¥�� ������ �߸��� ��� �޼����� �����ְ� �ٽ� �Է¹޾ƾ� �Ѵ�.
 * 
 * [������]
��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)
>>2009-12-12
��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)
>>2009/12/12
�Է��Ͻ� ��¥�� ������Դϴ�.
 */
public class Practice10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		while (true) {
		System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2007/05/11");						
			System.out.print(">>>");
			String str = sc.next();
			Date date = new Date();
			try {
				date = sdf.parse(str);
				cal.setTime(date);				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				continue;
			}
			int theDay = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println(cal.get(Calendar.DAY_OF_WEEK));
			String answer = null;
			switch (theDay) {
			case 1:
				answer = "��";
				break;
			case 2:
				answer = "��";
				break;
			case 3:
				answer = "ȭ";
				break;
			case 4:
				answer = "��";
				break;
			case 5:
				answer = "��";
				break;
			case 6:
				answer = "��";
				break;
			case 7:
				answer = "��";
				break;
			}
			System.out.println("�Է��Ͻ� ��¥�� " + answer + "���� �Դϴ�.");
		}
	}
}
/*
import java.util.*;
import java.text.*;

class Exercise10_4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�."; // 'E'�� ��~�� ���� �ϳ��� �ȴ�.
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		do {
			System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)");
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine()); // �Է¹��� ��¥�� Date�� ��ȯ�Ѵ�.
				break; // parse()���� ���ܰ� �߻��ϸ� �� ������ ������� �ʴ´�.
			} catch (Exception e) {
			}
		} while (true);
		System.out.println(df2.format(inDate));
	} // main
}
[�ؼ�] SimpleDateFormat�� ��¥�� ������ �������� ����ϰų� ���ڿ��� ������ ������
�� ��ȯ �Ǵ� ��ȿ�� �˻翡 ����� �� �ִ�. �� ���������� �Էµ� ��¥�� ������ ����
�� �´��� �˻��ϰ�, ��ȯ�ϴ� ������ �Ѵ�.
Scanner�� �̿��ؼ� ȭ������ ���� ��¥�� �Է¹ް�, �Է¹��� ��¥(���ڿ�)�� ������
���İ� �ٸ��� parse()���� ParseException�� �߻��Ѵ�.
do {
		System.out.println("��¥�� " + pattern
			+ "�� ���·� �Է����ּ���.(�Է¿�:2007/05/11)");
		try {
			System.out.print(">>");
			inDate = df.parse(s.nextLine()); // ParseException�� �߻��� �� �ִ�.
			break; // parse()���� ���ܰ� �߻��ϸ� �� ������ ������� �ʴ´�.
		} catch(Exception e) {}
	} while(true);
parse()���� ���ܰ� �߻��ϸ� break���� ������� �ʱ� ������ ���ܰ� �߻����� ���� ��
����, �� ������ ���Ŀ� �°� ��¥�� �Էµ� ������ �ݺ��ϰ� �ȴ�.
*/