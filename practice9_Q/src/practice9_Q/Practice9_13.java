package practice9_Q;

/*
 * [9-13] 다음은 하나의 긴 문자열(source) 중에서 특정 문자열과 일치하는 문자열의 개수를 구하는 예제이다. 빈 곳을 채워 예제를 완성하시오.
 * 
 * [실행결과]
 * aabbccAABBCCaa
 * aa를 2개 찾았습니다.
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
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		//System.out.println(src.length());
		//System.out.println(key.length());
		//String copy=new String(src);
				
		for (int i = 0; i < src.length()-1; i++) {			
			//if(src.substring(i,key.length()+i).length()==key.length()) {
			//key.length()+i 증가
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
		System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
	}

}
