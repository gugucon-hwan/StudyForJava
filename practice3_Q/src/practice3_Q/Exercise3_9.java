package practice3_Q;

public class Exercise3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'z';
		boolean b = (('a'<=ch&&'z'<=ch)||('A'<=ch&&'Z'<=ch)||('0'<=ch||'9'<=ch))?true:false;
		System.out.println(b);
	}
}
