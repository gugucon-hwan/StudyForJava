package practice10_Q;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * [10-1] CalendarŬ������ SimpleDateFormatŬ������ �̿��ؼ� 2010���� �ſ� �� ��° �Ͽ����� ��¥�� ����Ͻÿ�.
 * 
 * [������]
2010-01-10�� 2��° �Ͽ����Դϴ�.
2010-02-14�� 2��° �Ͽ����Դϴ�.
2010-03-14�� 2��° �Ͽ����Դϴ�.
2010-04-11�� 2��° �Ͽ����Դϴ�.
2010-05-09�� 2��° �Ͽ����Դϴ�.
2010-06-13�� 2��° �Ͽ����Դϴ�.
2010-07-11�� 2��° �Ͽ����Դϴ�.
2010-08-08�� 2��° �Ͽ����Դϴ�.
2010-09-12�� 2��° �Ͽ����Դϴ�.
2010-10-10�� 2��° �Ͽ����Դϴ�.
2010-11-14�� 2��° �Ͽ����Դϴ�.
2010-12-12�� 2��° �Ͽ����Դϴ�.
 */
public class Practice10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");		
		
			
		for(int i=0;i<12;i++) {
		cal.set(Calendar.YEAR,2010);
		cal.set(Calendar.MONTH,i);
		cal.set(Calendar.WEEK_OF_MONTH,3);
		cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
		
		System.out.println(sdf.format(cal.getTime()));
		}
	}

}
/*
import java.text.*;

class Exercise10_1 {
public static void main(String[] args)
{
Calendar cal = Calendar.getInstance();
cal.set(2010,0,1); // cal�� ��¥�� 2010�� 1�� 1�Ϸ� �����Ѵ�.
for(int i=0; i < 12;i++) {
int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1���� ������ ���Ѵ�.
// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
// 1���� �Ͽ����� ��쿡�� �ι�° �Ͽ����� 8���̰�,
// 1���� �ٸ� ������ ���� 16���� 1���� ����(weekday)�� ���� �� �� �ִ�.
int secondSunday = (weekday==1) ? 8 : 16 - weekday;
// �� ��° �Ͽ���(secondSunday)�� cal�� ��¥(DAY_OF_MONTH)�� �ٲ۴�.
cal.set(Calendar.DAY_OF_MONTH, secondSunday);
Date d = cal.getTime(); // Calendar�� Date�� ��ȯ�Ѵ�.
System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դ�
��.").format(d));
// ��¥�� ������ 1�Ϸ� �����Ѵ�.
cal.add(Calendar.MONTH, 1);
cal.set(Calendar.DAY_OF_MONTH,1);
}
}
}
*/