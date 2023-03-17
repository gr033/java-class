//사용자에게 구구단 중 몇단을 출력할지 입력받아 해당 구구단을 출력하는 프로그램을 작성
//예) 2단 출력 
import java.util.Scanner;
class MultiTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x=0, y, z=0;
		System.out.println("몇단을 출력할까요?");
		x = sc.nextInt();
		if (x<1)
		{System.out.println("양수를 입력하세요");return;}
		for (y = 1 ; y<=9 ; y++){
			z = x*y;
			System.out.println(x+"*"+y+"="+z);
			}
	}
}
