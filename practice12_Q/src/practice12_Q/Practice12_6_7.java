package practice12_Q;


/*
 * [12-6] ���� �� ��Ÿ �ֳ����̼��� �ƴ� ���� ��� ���ÿ�.
a. Documented
b. Target
c. Native
d. Inherited

[����]
c

@Override �����Ϸ����� �������̵��ϴ� �޼����� ���� �˸���.
@Deprecated ������ ������� ���� ���� �����ϴ� ��� ���δ�.
@SuppressWarnings �����Ϸ��� Ư�� ���޽����� ��Ÿ���� �ʰ� ���ش�.
@SafeVarargs ���׸��� Ÿ���� �������ڿ� ����Ѵ�.(JDK1.7)
@FunctionalInterface �Լ��� �������̽���� ���� �˸���.(JDK1.8)
@Native native�޼��忡�� �����Ǵ� ��� �տ� ���δ�.(JDK1.8)
@Target* �ֳ����̼��� ���밡���� ����� �����ϴµ� ����Ѵ�.
@Documented* �ֳ����̼� ������ javadoc���� �ۼ��� ������ ���Եǰ� �Ѵ�.
@Inherited* �ֳ����̼��� �ڼ� Ŭ������ ��ӵǵ��� �Ѵ�.
@Retention* �ֳ����̼��� �����Ǵ� ������ �����ϴµ� ����Ѵ�.
@Repeatable* �ֳ����̼��� �ݺ��ؼ� ������ �� �ְ� �Ѵ�.(JDK1.8)
�ڹٿ��� �⺻������ �����ϴ� ǥ�� �ֳ����̼�(*�� ���� ���� ��Ÿ �ֳ����̼�)


[12-7] �ֳ����̼� TestInfo�� ������ ���� ���ǵǾ� ���� ��, �� �ֳ����̼��� �ùٸ�
�� ������� ���� ����?
@interface TestInfo {
int count() default 1;
String[] value() default "aaa";
}
a. @TestInfo class Exercise12_7 {}
b. @TestInfo(1) class Exercise12_7 {}
c. @TestInfo("bbb") class Exercise12_7 {}
d. @TestInfo("bbb","ccc") class Exercise12_7 {}

[����]
b, d

[�ؼ�]
a. @TestInfo class Exercise12_7 {}
default���� �����Ǿ� �ִ� ��Ҵ� �ֳ����̼��� ������ ������ ������ �� �ִ�.
b. @TestInfo(1) class Exercise12_7 {}
����� �̸��� value�� �ƴ� ��쿡�� ����� �̸��� ������ �� ����.
��@TestInfo(count=1)���̶�� ��� ����.
c. @TestInfo("bbb") class Exercise12_7 {}
@TestInfo(count=1, value={"bbb"})�� ������ ����
d. @TestInfo("bbb","ccc") class Exercise12_7 {}
����� Ÿ���� �迭�̰�, �����Ϸ��� ���� ���� ���� ��� ��ȣ{}�� �ʿ���.
@TestInfo({"bbb", "ccc"}) �Ǵ� @TestInfo(value={"bbb","ccc"})�� ���� �����

 * 
 */
public class Practice12_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
