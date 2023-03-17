//원기둥의 부피 구하기(반지름 5, 높이 50, 부피3926.99)
import java.util.Scanner;
class V
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double r, h, V;
		System.out.println("r = ?");
		r = sc.nextDouble();
		System.out.println("h = ?");
		h = sc.nextDouble();
		V = r * r * Math.PI * h;
		System.out.println("V = "+V);
	}
}
