package practice10_Q;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * [10-7] 2016�� 12�� �׹�° ȭ������ ��¥�� �Ʒ��� �������� ���� �������� ����Ͻÿ�.
 * 
 * 
 * [������]
 * 2016-12-27
 * 
 * LocalDate date = LocalDate.of(2016, 12, 1);
 * System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY))); 
 */
public class Practice10_7 {

	/**
	  * @Method Name : main
	  * @�ۼ��� : 2020. 8. 26
	  * @�ۼ��� : gugucon
	  * @�����̷� : 
	  * @Method ���� :
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.set(2016,Calendar.DECEMBER,1);
		//cal.add(Calendar.DAY_OF_WEEK, 3);
		
		int dayOfWeek;
		int count=0;
		for(int i=0;i<30;i++) {
			dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
			if(dayOfWeek==Calendar.TUESDAY) {
				count++;
				if(count>=4) {
					System.out.println(sdf.format(cal.getTime()));
				}
			}				
			cal.add(Calendar.DATE, 1);//1�� ���ϱ�		
		}//for		
				
	}//main

}
