import java.util.Scanner;
class GugudanTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력할까요?");
		int dan = sc.nextInt();
		int result;
		for (int i=1 ; i<=9 ; i++)
		{
			result = dan*i;
			System.out.println(dan+"*"+i+"="+result);
		}
	}
}
