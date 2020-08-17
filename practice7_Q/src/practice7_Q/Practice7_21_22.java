package practice7_Q;

/*
 * [7-21] ������ ���� attack�޼��尡 ���ǵǾ� ���� ��, �� �޼����� �Ű������� �����Ѱ� �� ������ �����ÿ�.
 * 
 * interface Movable {
 * void move(int x, int y);
 * }
 * void attack(Movable f) {
 *  ���� ���� }
 *  
 *  [����] null, Movable�������̽��� ������ Ŭ���� �Ǵ� �� �ڼ��� �ν��Ͻ�
 *  
 *  [�ؼ�] �Ű������� �������� �� �����ϰ� �ִ����� Ȯ���ϴ� �����̴�. �Ű������� Ÿ��
 *  �� �������̽���� ���� � �ǹ����� �������� ���ϴ� ��찡 ������, �̰��� �����ϴ°��� �ſ� �߿��ϴ�.
 *  ������ ���� ��Movable�������̽�Ÿ���� �Ű������� ������ ���� �����̳�?���� ������ ��, ���� ���� ����� �� �ֵ��� ������ �ܿ�� �־�� �Ѵ�.
 *  
 *  
 *  [7-22] �Ʒ��� ������ ������ ShapeŬ�����̴�. �� Ŭ������ �������� �ϴ� CircleŬ������ RectangleŬ������ �ۼ��Ͻÿ�. �� ��, �����ڵ� �� Ŭ������ �°� ������ �߰��ؾ��Ѵ�.
 *  
 *  
 *  (1) Ŭ������ : Circle
 *  ����Ŭ���� : Shape
 *  ������� : double r - ������
 *  
 *  
 *  (2) Ŭ������ : Rectangle
 *  ����Ŭ���� : Shape
 *  ������� : double width - ��
 *  double height - ����
 *  
 *  �޼��� :
 *  1. �޼���� : isSquare
 *  �� �� : ���簢������ �ƴ����� �˷��ش�.
 *  ��ȯŸ�� : boolean
 *  �Ű����� : ����
 *  
 *  
 *  
 */

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape{
	
	private double r;	//������
	
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		this(new Point(0, 0),r);
	}
	public Circle(Point p, double r) {
		// TODO Auto-generated constructor stub
		super(p);
		this.r=r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub		
		return r*r*Math.PI;
	}	
}

class Rectangle extends Shape{
	
	private double width;	//��
	private double height;	//����
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this(new Point(0, 0),width,height);
	}
	
	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width=width;
		this.height=height;	
	}
	
	boolean isSquare() { //���簢������ �ƴ����� �˷��ش�.
		// width�� height�� 0�� �ƴϰ� width�� height�� ������ true�� ��ȯ�Ѵ�
		return width*height!=0&&width==height;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub		
		return width*height;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class Practice7_21_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Point p = new Point(10, 20);
		Shape r=new Rectangle(new Point(), 30, 30);
		Rectangle r2=(Rectangle)r;
		Shape c= new Circle(new Point(), 15);
		System.out.println("p �ƹ��� ��ǥ : "+p.toString());
		System.out.println("r ����� ���� : "+r.calcArea());
		System.out.println("r2 ������� �ΰ�? : "+r2.isSquare());
		System.out.println("c �� ���� : "+c.calcArea());
	}

}
