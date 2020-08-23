package practice9_Q;

/*
 * [9-10] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : format
 * �� �� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ�Ѵ�. ������ ������ �������� ä���.
 * ��ȯŸ�� : String
 * �Ű����� : String str - ��ȯ�� ���ڿ�
 * int length - ��ȯ�� ���ڿ��� ����
 * int alignment - ��ȯ�� ���ڿ��� ��������
 * (0:���� ����, 1: ��� ����, 2:������ ����)
 * 
 * [������]
	������
		������
			������
 */
public class Practice9_10 {
	/*
	(1) format�޼��带 �ۼ��Ͻÿ�.
		1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
		2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
		3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.
				(System.arraycopy()���)
		4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
	*/
	public static String format(String str, int length, int alignment) {
		
			if(length<str.length())
				return str.substring(0, length);
			else {
				char[] source=str.toCharArray();
				char[] chs=new char[length];
				for(int i=0;i<chs.length;i++)
					chs[i]=' ';
				switch(alignment) {
				case 0:
					default:
						System.arraycopy(source, 0, chs, 0, source.length);
						break;
					case 1:
						System.arraycopy(source, 0, chs, (length-str.length())/2, source.length);
						break;
					case 2:
						System.arraycopy(source, 0, chs, length-str.length(), source.length);
				}
				return new String(chs);	
			}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "������";
		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}

}
