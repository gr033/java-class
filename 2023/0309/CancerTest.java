import java.util.Scanner;
class  CancerTest
{
	public static void main(String[] args) 
	{
		String a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요(영문표기) ->");
		a = sc.next();
		System.out.println("나이를 입력하세요 ->");
		b = sc.nextInt();
		
		if(b >= 40)
		{
			System.out.println(a+"님은 무료 암검진 대상자입니다");
		}
		else
		{
			System.out.println(a+"님은 무료 암검진 대상자가 아닙니다");
		}
	}
}
