class Rectangle
{
	double width;
	double length;
	public double calcArea(){
		double area = width*length;
		return area;
	}
}
class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle rec;
		rec = new Rectangle();
		rec.width = 15.8;
		rec.length = 15.2;
		double area = rec.calcArea();
		System.out.println(area);
	}
}
