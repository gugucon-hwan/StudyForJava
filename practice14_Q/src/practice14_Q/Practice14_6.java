package practice14_Q;

import java.util.Comparator;
import java.util.stream.Stream;

public class Practice14_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"aaa","bb","c","dddd"};
		Stream<String> strStream=Stream.of(strArr);		
		strStream.map(String::length) // strStream.map(s-> s.length())
		.sorted(Comparator.reverseOrder()) // ���ڿ� ���̷� ���� ����
		.limit(1).forEach(System.out::println); // ���� �� ���ڿ��� ���� ���
	}
}
