import java.util.Scanner;
abstract class Shape
{
	protected double length;
	protected double width;
	public Shape(){}
	public Shape(double length, double width){
		this.length = length;
		this.width = width;
	}
	public abstract double Round();
	public abstract double Area();
}
class Triangle extends Shape
{
	public Triangle(double length, double width){
		super(length, width);
	}
	public double Round(){
		return 3*length;
	}
	public double Area(){
		return (length*width)/2;
	}
}
class Rectangle extends Shape
{
	public Rectangle(double length, double width){
		super(length, width);
	}
	public double Round(){
		return (length+width)*2;
	}
	public double Area(){
		return length*width;
	}
}
class ShapeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int type;
		double length, width;
		Shape s[] = new Shape[2];
		
		for(int i=0;i<s.length;i++){
			System.out.println("(1)정삼각형, (2)사각형");
			type = sc.nextInt();
			System.out.println("너비 입력 : ");
			length = sc.nextDouble();
			System.out.println("높이 입력 : ");
			width = sc.nextDouble();
			switch (type){
			case 1:
				s[i] = new Triangle(length, width);
				break;
			case 2:
				s[i] = new Rectangle(length, width);
				break;
			}
		}
		for (int i=0;i<s.length;i++){
				System.out.println((i+1)+"번째 도형");
				System.out.println("둘레: "+s[i].Round());
				System.out.println("넓이: "+s[i].Area());
		}
	}
}