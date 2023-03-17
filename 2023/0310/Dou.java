import java.util.Scanner;
class Dou
{
	public static void main(String[] args) 
	{
		int m;
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		if(m%2==0)
		{
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		else
		{
		System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}
}
