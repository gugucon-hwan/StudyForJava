package practice10_Q;

import java.math.BigDecimal;
import java.util.Arrays;

/*
 * [10-3] ���ڿ� ��123,456,789.5���� �Ҽ��� ù ��° �ڸ����� �ݿø��ϰ�, �� ���� �� �������� �޸�(,)�� �����ؼ� ����Ͻÿ�.
 * 
 * [������]
data:123,456,789.5
�ݿø�:123456790
������:1,2345,6790
 */
public class Practice10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("123,456,789.5");
		String tmp=null;
		int ch = 0;		
		System.out.println("data : "+str);
		str=str.replace(",", "");
		if(str.indexOf(".")!=-1) {
			ch=str.indexOf(".");
			tmp=str.substring(ch+1, ch+2);		
			str=str.substring(0, ch);
		}		
		double num=Double.parseDouble(tmp);
		num/=10;
		//System.out.println("�߶� �� �Ҽ��� �Ʒ� : "+num);
		int num2=Integer.parseInt(str);
		//System.out.println("�߶󳽰� ���� : "+num2);		
		//���ڰ� �ʹ� Ŀ�� �ε��Ҽ������� ǥ���� �׷��� BigDecimal �����		
		BigDecimal answer=new BigDecimal(Math.round(num+num2));
		System.out.println("�ݿø� : "+answer.toString());		 
		String man=String.valueOf(answer);
		StringBuffer result= new StringBuffer(man);
		StringBuffer dab= new StringBuffer();
		result=result.reverse();
		int a=result.length()/4;
		for(int i=0;i<a+1;i++) {
			if(i>=a) {
				System.out.println(dab.append(","+result.substring(4*i)));
				break;
			}
			System.out.println(dab.append(","+result.substring(0+(4*i),4+(4*i))));
		}		
		dab.reverse();
		dab.deleteCharAt(dab.length()-1);
		System.out.println("������ : "+dab.toString());
	}//main
}

/*
String data = "123,456,789.5";
DecimalFormat df = new DecimalFormat("#,###.##"); // ��ȯ�� ���ڿ��� ������ ����
DecimalFormat df2 = new DecimalFormat("#,####");
try {
Number num = df.parse(data);
double d = num.doubleValue();
System.out.println("data:"+data);
System.out.println("�ݿø�:"+Math.round(d));
System.out.println("������:"+df2.format(d));
} catch(Exception e) {}
*/