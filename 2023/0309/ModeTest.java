import java.util.Scanner;
class Grade
{
	public static void main(String[] args) 
	{
		int a, b, c, d;
		double e;
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�� ���� ������ �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("C��� ���α׷��� ������ �Է��Ͻÿ�");
		b = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		c = sc.nextInt();
		System.out.println("�Ϲ� ���� ������ �Է��Ͻÿ�");
		d = sc.nextInt();
		e = (a+b+c+d)/4.0;
		System.out.println("����� ��� ������ "+e+"�� �Դϴ�.");
	}
}
