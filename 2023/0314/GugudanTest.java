import java.util.Scanner;
class GugudanTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력할까요?");
		int dan = sc.nextInt();
		for (int i=1 ; i<=9 ; i++)
		{
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
