package practice9_Q;

/*
 * [9-13] ������ �ϳ��� �� ���ڿ�(source) �߿��� Ư�� ���ڿ��� ��ġ�ϴ� ���ڿ��� ������ ���ϴ� �����̴�. �� ���� ä�� ������ �ϼ��Ͻÿ�.
 * 
 * [������]
 * aabbccAABBCCaa
 * aa�� 2�� ã�ҽ��ϴ�.
 */
public class Practice9_13 {
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0)
			return 0;
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		//System.out.println(src.length());
		//System.out.println(key.length());
		//String copy=new String(src);
				
		for (int i = 0; i < src.length()-1; i++) {			
			//if(src.substring(i,key.length()+i).length()==key.length()) {
			//key.length()+i ����
				if (src.substring(i, key.length()+i).equals(key)) {
					count++;
				}				
			//}
		}
/*
 * while((index = src.indexOf(key, pos))!=-1) {
			count++;
			pos = index + key.length();
	}
 * 
 */
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa�� " + stringCount(src, "aa") + "�� ã�ҽ��ϴ�.");
	}

}
