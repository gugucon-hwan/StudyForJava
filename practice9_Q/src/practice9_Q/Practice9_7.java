package practice9_Q;


/*
 * [9-7] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : contains
 * �� �� : ù ��° ���ڿ�(src)�� �� ��° ���ڿ�(target)�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
 * ���ԵǾ� ������ true, �׷��� ������ false�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : boolean
 * �Ű����� : String src
 * String target
 * [Hint] StringŬ������ indexOf()�� ����� ��
 * 
 * 
 * 
 */
public class Practice9_7 {
	/*
	(1) contains�޼��带 �ۼ��Ͻÿ�.
	*/
	public static boolean contains(String src, String target) {		
		for(int i=0;i<src.length();i++) {
			if(src.indexOf(target)!=-1){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}

}
