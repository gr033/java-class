//사용자에게 출력할 단을 입력받아 해당 구구단 do while문 이용하여 출력
import java.util.Scanner;
class GuguDanDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int dan, i = 1;
		System.out.println("몇단을 출력할까요?");
		dan = sc.nextInt();
		do
		{
			System.out.println(dan+"*"+i+"="+(dan*i));
			i++;
		}
		while (i <=9);
		System.out.println("출력 완료");
	}
}
