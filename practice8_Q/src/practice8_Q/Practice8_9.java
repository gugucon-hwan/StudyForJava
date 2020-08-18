package practice8_Q;


/*
 * [8-9] ������ ���� ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
[����] �����ڴ� �������� ���� �˸°� �ۼ��ؾ��Ѵ�.

* Ŭ������ : UnsupportedFuctionException
* ����Ŭ������ : RuntimeException
* ������� :
�� �� : ERR_CODE
���尪 : �����ڵ�
Ÿ �� : int
�⺻�� : 100
������ : final private

* �޼��� :
1. �޼���� : getErrorCode
�� �� : �����ڵ�(ERR_CODE)�� ��ȯ�Ѵ�.
��ȯŸ�� : int
�Ű����� : ����
������ : public

2. �޼���� : getMessage
�� �� : �޼����� ������ ��ȯ�Ѵ�.(ExceptionŬ������ getMessage()�� �������̵�)
��ȯŸ�� : String
�Ű����� : ����
������ : public
 * 
 * [������]
 * Exception in thread "main" UnsupportedFuctionException: [100]�������� �ʴ� ����Դϴ�.
 * at Exercise8_9.main(Exercise8_9.java:5)
 * 
 * [�ؼ�] �����޽����� �����ϴ� �ν��Ͻ����� msg�� ��ӹ��� ���̹Ƿ� ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ�ǵ��� �ؾ� �Ѵ�. 
 * ERR_CODE�� �� �� ���� �����Ǹ� �ٲ�� ���� �ƴ϶� final�� �ٿ��� ����� �ߴ�. �׸��� �����ڸ� ���� �ʱ�ȭ�Ͽ���.
 * 
 * UnsupportedFuctionException(String msg, int errCode) { // ������
 * super(msg); // ������ ������ RuntimeException(String msg)�� ȣ��
 * ERR_CODE = errCode;
 * }
 * 
 * getMessage() ���� �������κ��� ��ӹ��� ���̸�, ERR_CODE�� ���� ��µǵ��� �ϱ� ���� �������̵��ߴ�. 
 * ������ �޼��带 �������̵��� ����, �����ϴٸ� ������ �޼��带 ��Ȱ���ϴ� ���� ����.
 * 
 * public String getMessage() { // Exception�� getMeesage()�� �������̵��Ѵ�.
 * return "["+getErrCode()+"]" + super.getMessage();
 * }
 */
class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;		
	
	public UnsupportedFuctionException(String msg, int error_code) {
		// TODO Auto-generated constructor stub
		super(msg);
		ERR_CODE=error_code;
	}
	public UnsupportedFuctionException(String msg) {
		this(msg,100);
	}

	public int getErrorCode() {// ���� �ڵ带 ���� �� �ִ� �޼��嵵 �߰��ߴ�
		return ERR_CODE;// �� �޼���� �ַ� getMessage()�� �Բ� ���� ���̴�
	}
	
	public String getMessage() {// Exception�� getMeesage()�� �������̵��Ѵ�.
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}

public class Practice8_9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100);
	}
	
}
