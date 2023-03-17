//줄 수를 입력하세요
//줄 수마다 하나씩 별 증가
import java.util.Scanner;
class ForTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int y;
		System.out.println("줄 수를 입력하세요");
		y = sc.nextInt();

		for (int i=1;i<=y;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
