package practice9_Q;

/*
 * [9-3] ������ ���� �������� �������� �ڵ带 �ϼ��Ͻÿ�.
 * 
 * [������]
 * fullPath:c:\jdk1.8\work\PathSeparateTest.java
 * path:c:\jdk1.8\work
 * fileName:PathSeparateTest.java
 * 
 */
public class Practice9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		 */
		path=fullPath.substring(0,14);
		fileName=fullPath.substring(15);
		/*
		 * int pos = fullPath.lastIndexOf("\\");
		 * if(pos!=-1) {
		 * path = fullPath.substring(0, pos);
		 * fileName = fullPath.substring(pos+1);
		 * }
		 * 
		 * [�ؼ�] lastIndexOf()�� substring()�� ����ؼ� ���ڿ��� ������ ������. ������ ��α����ڸ� ã�ƾ��ϱ� ������, indexOf()���ٴ� lastIndexOf()�� �����ϴ�.
		 * lastIndexOf()�� ã�� ���ڿ��� ������ -1�� ��ȯ�ϱ� ������ ���ǹ��� ����ؼ� �����
		 * -1�� ��쿡�� substring()�� ȣ������ �ʾƾ� �Ѵ�.(pos�� ���� �����̸�, substring()���� ���ܰ� �߻��Ѵ�.)
		 * �׷��� if������ ó���� ���־��µ�, try-catch�� ó���ص� ����.(if�� ���� ������ Ǯ��� ����� ���� ����̴�.)
		 * [����] �Ʒ��� �� ������ ���� ���� �ǹ��̴�.
		 * 
		 */
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}

}
