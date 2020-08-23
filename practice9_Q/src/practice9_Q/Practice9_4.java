package practice9_Q;

/*
 * [9-4] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : printGraph
 * �� �� : �־��� �迭�� ��� ����ŭ �־��� ���ڸ� ���η� ����� ��, ���� ����Ѵ�.
 * ��ȯŸ�� : ����
 * �Ű����� : int[] dataArr - ����� �׷����� ������
 * char ch - �׷����� ����� ����.
 * 
 * [������]
 * ***3
 * *******7
 * *1
 * ****4
 * 
 */
public class Practice9_4 {
	static void printGraph(int[] dataArr, char ch) {
		/*
		 * (1) printGraph�޼��带 �ۼ��Ͻÿ�.
		 */
		for (int i = 0; i < dataArr.length; i++) {
			for (int j = 0; j < dataArr[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(dataArr[i]);
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}

}