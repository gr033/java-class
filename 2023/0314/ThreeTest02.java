//특정 정수를 읽어들여서 0과 이 정수 사이에 있는 모든 3의 배수를 출력
//정수값이 0보다 작으면 오류메세지
import java.util.Scanner;
class ThreeTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를입력하세요");
		int n = sc.nextInt();
		if (n<0)
		{
			System.out.println("입력 오류");
			return;
		}
		System.out.print("3의 배수 : ");
		for (int i = 1; i <=n-3 ; i++)
		{	
			if (i%3 == 0)
			{
				System.out.print(i +", ");
			}
		}
		for (int i = n-2; i <=n ; i++)
		{	
			if (i%3 == 0)
			{
				System.out.print(i);
			}
		}
	}
}
