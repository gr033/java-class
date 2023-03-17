/*
while문으로 먼저 하고, do while문으로 사용
사용자에게 n을 입력받고 n!을 구하여 출력
*/
import java.util.Scanner;
class FactorialTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		int n = sc.nextInt();
		int fac =1;
		int i = n;
		do
		{
			fac = fac*i;
			System.out.print(i);
			if(i!=1){System.out.print("*");}
			i--;
		}
		while (i>=1);
		System.out.println("="+fac);
	}
}
		/*
		while (i <= n)
		{
			fac = fac*i;
			i++;
		}
		*/