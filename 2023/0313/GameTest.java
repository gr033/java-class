//가위바위보게임
import java.util.Random;
import java.util.Scanner;
class GameTest 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int com = r.nextInt(3);
		System.out.println("가위 : 0, 바위 : 1, 보 : 2");
		System.out.println("입력하세요 : ");
		int user = sc.nextInt();
		System.out.println("컴퓨터 : " + com);
		if (com == user)
		{
			System.out.println("비겼습니다.");
			return;
		}
		if (user == 0)
		{
			if (com == 1)
			{
				System.out.println("졌습니다.");
			}
			else if (com == 2)
			{
				System.out.println("이겼습니다.");
			}
		}
		if (user == 1)
		{
			if (com == 2)
			{
				System.out.println("졌습니다.");
			}
			else if (com == 0)
			{
				System.out.println("이겼습니다.");
			}
		}if (user == 2)
		{
			if (com == 0)
			{
				System.out.println("졌습니다.");
			}
			else if (com == 1)
			{
				System.out.println("이겼습니다.");
			}
		}
	}
}
