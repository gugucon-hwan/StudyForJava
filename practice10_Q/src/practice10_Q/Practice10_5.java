package practice10_Q;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * [10-5] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : getDayDiff
 * �� �� : yyyymmdd������ �� ���ڿ��� �Ѱܹ����� �� ��¥�� ���̸� ��(day)������ ��ȯ�Ѵ�.
 *  * ��, ù ��° ��¥ ���� �� ��° ��¥�� ����� ��ȯ�Ѵ�.
 *  ���� �־��� ���ڿ��� ��ȿ���� ������ 0�� ��ȯ�Ѵ�.
 *  
 *  ��ȯŸ�� : int
 *  
 *  �Ű����� : 
 *  String yyyymmdd1 - ���۳�¥
 *  String yyyymmdd2 - �� ��¥
 * 
 * [������]
 * 2
 * 0
 * 0
 */
public class Practice10_5 {
	/*
	 * (1) getDayDiff�޼��带 �ۼ��Ͻÿ�.
	 */
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Date date1 = new Date();
		Date date2 = new Date();
		try {
			date1 = sdf.parse(yyyymmdd1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return 0; // ���� �߻��� 0�� ��ȯ
		}
		try {
			date2 = sdf.parse(yyyymmdd2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return 0; // ���� �߻��� 0�� ��ȯ
		}
		// .getTime() �� �ش糯¥�� ��������1970�� 00:00:00 ���� �� �и��ʰ� �귶������ ��ȯ���ش�.
		// ���� 24*60*60*1000(�� �ð����� ���� ������) �� �����ָ� �ϼ��� ���´�.
		long diffDay = date2.getTime() - date1.getTime();
		long Days = diffDay / (24 * 60 * 60 * 1000);
		Days = Math.abs(Days);
		return (int) Days;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}

}
/*
static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
int diff = 0;
try {
int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
int month1 = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1;
int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
int month2 = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
Calendar date1 = Calendar.getInstance();
Calendar date2 = Calendar.getInstance();
date1.set(year1, month1, day1);
date2.set(year2, month2, day2);
diff = (int)((date1.getTimeInMillis()-date2.getTimeInMillis())
/(24*60*60*1000));
} catch(Exception e) {
diff = 0; // substring(), parseInt()���� ���ܰ� �߻��ϸ� 0�� ��ȯ�Ѵ�.
}
return diff;
}
*/