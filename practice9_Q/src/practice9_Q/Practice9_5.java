package practice9_Q;

/*
 * [9-5] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : count
 * �� �� : �־��� ���ڿ�(src)�� ã������ ���ڿ�(target)�� �� �� �������� ��� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : String src
 * String target
 * [Hint] StringŬ������ indexOf(String str, int fromIndex)�� ����� ��
 * 
 * [������]
 * 3
 * 0
 */

public class Practice9_5 {
	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		/*
		 * (1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�. 1. src���� target�� pos�� ��ġ���� ã�´�. 2. ã���� count�� ����
		 * 1 ���� ��Ű��, pos�� ���� target.length��ŭ ������Ų��. 3. indexOf�� ����� -1�̸� �ݺ����� ����������
		 * count�� ��ȯ�Ѵ�.
		 */
			
		pos=src.indexOf("AB",pos);
		while (true) {			
			if (pos != -1) {
				count++;
				pos += target.length();
				pos=src.indexOf("AB",pos);		
			} else {
				break;
			}			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}

}
