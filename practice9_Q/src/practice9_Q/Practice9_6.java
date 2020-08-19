package practice9_Q;

import java.util.Arrays;

/*
 * [9-6] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : fillZero
 * �� �� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ��� �����, ���� �� ������ '0'���� ä���.
 * ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�ι�ȯ�Ѵ�.
 * ���� �־��� length�� ���� 0���� ���ų� ���� ���̸�, �� ���ڿ�("")�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : String
 * �Ű����� : String src - ��ȯ�� ���ڿ�
 * int length - ��ȯ�� ���ڿ��� ����
 * 
 * [������]
 * 0000012345
 * 123
 */
public class Practice9_6 {
	public static String fillZero(String src, int length) {
		/*
		 * (1) fillZero�޼��带 �ۼ��Ͻÿ�. 1. src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
		 * 2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�. 3. src�� ���̰� length�� ������ ũ�� src��
		 * length��ŭ �߶� ��ȯ�Ѵ�. 4. ���̰� length�� char�迭�� �����Ѵ�. 5. 4���� ������ char�迭�� '0'���� ä���.
		 * 6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�. 7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		 */
		if (src == null || src.length() == length) {
			return src;
		} else if (length <= 0) {
			return "";
		} else if (src.length() > length) {
			return src.substring(0, length);
		} else {
			char[] c = new char[length];
			int count=0;
			for (int i = 0; i < c.length; i++) {
				c[i] = '0';
			}
			for (int i = length-src.length(); i < length; i++) {
				c[i] = src.charAt(count++);				
			}
			String s=String.valueOf(c);			
			return s;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}

}
