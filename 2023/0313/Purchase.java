//상점에서 하나에 100원인 물건을 판매. 물건을 10개 이상 구입하는 고객에게는 10%를 할인.
//전체 가격 출력(if else)
import java.util.Scanner;

class Purchase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m, money;
		System.out.println("구입할 갯수를 입력하세요 : ");
		m = sc.nextInt();
		if (m >= 10)
		{
			money = m*90;
		}
		else if (m <0)
		{
			System.out.println("입력값이 잘못되었습니다.");
			return;
		}
		else 
		{
			money = m*100;
		}
			System.out.println("가격 : " + money);
	}
}
