package practice10_Q;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;


/**
  * @FileName : Practice10_8.java
  * @Project : practice10_Q
  * @Date : 2020. 8. 26 
  * @�ۼ��� : gugucon
  * @�����̷� :
  * @���α׷� ���� :[10-8] ����� ���尣�� ������ ������ ����Ͽ� ����Ͻÿ�.
  * 
  *[������]
 * 2020-08-26T04:22:45.027+09:00[Asia/Seoul]
 * 2020-08-25T15:22:45.029-04:00[America/New_York]
 * sec1=32400
 * sec2=-14400
 * diff=13 hrs
  */
public class Practice10_8 {

	/**
	  * @Method Name : main
	  * @�ۼ��� : 2020. 8. 26
	  * @�ۼ��� : gugucon
	  * @�����̷� : 
	  * @Method ���� : ����� ������ ���� ���
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zoneSeoul=ZonedDateTime.now();
		
		ZoneId nyId=ZoneId.of("America/New_York");
		ZonedDateTime zoneNy=ZonedDateTime.now().withZoneSameInstant(nyId);
				
		long krOffsetInSec=zoneSeoul.getOffset().getTotalSeconds();		
		long nyOffsetInSec=zoneNy.getOffset().getTotalSeconds();
		System.out.println(zoneSeoul);
		System.out.println(zoneNy);
		System.out.println("sec1="+krOffsetInSec);
		System.out.println("sec2="+nyOffsetInSec);
		long diffHours=krOffsetInSec-nyOffsetInSec;
		System.out.printf("diff=%d hrs%n",diffHours/(60*60));
	}

}
