package practice9_Q;


/*
 * [9-9] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : delChar
 * �� �� : �־��� ���ڿ����� ������ ���ڵ��� �����Ͽ� ��ȯ�Ѵ�.
 * ��ȯŸ�� : String
 * �Ű����� : String src - ��ȯ�� ���ڿ�
 * String delCh - ������ ���ڵ�� ������ ���ڿ�
 * [��Ʈ] StringBuffer�� StringŬ������ charAt(int i)�� indexOf(int ch)�� ����϶�.
 * 
 * [������]
 * (1!2@3^4~5) -> 12345
 * (1 2 3 4 5) -> (12345)
 * 
 * 
 * public static String delChar(String src, String delCh) {
 * StringBuffer sb = new StringBuffer(src.length());
 * for(int i=0; i < src.length();i++) {
 * char ch = src.charAt(i);
 * // ch�� delCh�� ���Ե����� ������(indexOf()�� ��ã����) sb�� �߰�
 * if(delCh.indexOf(ch)==-1) // indexOf(int ch)�� ȣ��
 * sb.append(ch);
 * }
 * return sb.toString(); // StringBuffer�� ����� ������ String���� ��ȯ
 * }
 */

public class Practice9_9 {
	/*
	(1) delChar�޼��带 �ۼ��Ͻÿ�.
	*/
	public static String delChar(String src, String delCh) {
		StringBuffer buf = new StringBuffer(src);
			
		for(int i=0;i<buf.length();i++) {
			for(int j=0;j<delCh.length();j++) {
				if(buf.charAt(i)==delCh.charAt(j)) {
					buf.deleteCharAt(i);
				}
			}
		}
		src=new String(buf);
		return src;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}

}
