package practice3_Q;

public class Exercise3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 500;
		float celcius = (int)(((float)5/9*(fahrenheit-32)+0.005f)/0.01f)*0.01f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
}
