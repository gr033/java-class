//연습, 사용자에게 0~9사이의 정수를 입력받아 한글표기식 출력하는 프로그램을 작성
import java.util.Scanner;
class  NumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("0~9중 숫자 한개를 입력하세요");
		a = sc.nextInt();

		if(a == 0 )
		{System.out.println("영");}
		else if(a == 1 )
		{System.out.println("일");}
		else if(a == 2 )
		{System.out.println("이");}
		else if(a == 3 )
		{System.out.println("삼");}
		else if(a == 4 )
		{System.out.println("사");}
		else if(a == 5 )
		{System.out.println("오");}
		else if(a == 6 )
		{System.out.println("육");}
		else if(a == 7 )
		{System.out.println("칠");}
		else if(a == 8 )
		{System.out.println("팔");}
		else if(a == 9 )
		{System.out.println("구");}
	}
}
