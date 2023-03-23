//2차원 도형 : 사각형, 삼각형, 원
//이러한 2차원 도형들이 가져야 할 공통적인 속성과 동작을 뽑아서 부모클래스 Shape제작(일반화)
//속성 : 면적, 둘레
//동작 : 면적 계산, 둘레 계산
import java.util.Scanner;
abstract class Shape{
	protected double area;
	protected double round;
	protected int x;
	protected int y;
	public Shape(){
	}
	public Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public double getArea(){
		return area;
	}
	public double getRound(){
		return round;
	}
	public abstract void calcArea();
	public abstract void calcRound();
	public String toString(){
		return "x: "+x+", y: "+y+", 면적: "+area+", 둘레: "+round;
	}
}
class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(int x, int y, double width, double height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public Rectangle(){
	}
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public void calcArea(){
		area = width*height;
	}
	public void calcRound(){
		round = (width+height)*2;
	}
	public String toString(){
		String str = "도형의 종류: 사각형\n";
		str +=", 가로 길이: "+width+", 세로 길이: "+height+"\n";
		str += super.toString();
		return str;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(int x, int y, double radius){
		super(x, y);
		this.radius = radius;
	}
	public Circle(){
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void calcArea(){
		area = 2*radius*Math.PI;
	}
	public void calcRound(){
		round = radius*radius*Math.PI;
	}
	public String toString(){
		String str = "도형의 종류: 원\n";
		str += ", 반지름 길이: "+radius+"\n";
		str += super.toString();
		return str;
	}
}

class ShapeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Shape []arr = new Shape[3];
		int menu;
		int x, y;
		double width, height, radius;
		for(int i = 0; i<arr.length;i++){
			System.out.print("도형의 종류를 입력하라.[1]사각형  [2]원");
			menu = sc.nextInt();
			System.out.print("도형의 x위치: ");
			x = sc.nextInt();
			System.out.print("도형의 y위치: ");
			y = sc.nextInt();
			switch (menu){
			case 1:
				System.out.print("사각형의 가로길이: ");
				width = sc.nextDouble();
				System.out.print("사각형의 세로길이: ");
				height = sc.nextDouble();
				arr[i] = new Rectangle(x, y, width, height);
				break;
			case 2:
				System.out.print("원의 반지름길이: ");
				radius = sc.nextDouble();
				arr[i] = new Circle(x, y, radius);
				break;
			}	//end switch
		}		//end for
		System.out.println();
		for (int i = 0;i<arr.length;i++){
			arr[i].calcArea();
			arr[i].calcRound();
			System.out.println(arr[i].toString());
			System.out.println();
		}
	}			//end main
}				//end class