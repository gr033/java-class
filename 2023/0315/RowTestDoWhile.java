/*다음과 같이 동작하는 프로그램
줄 수를 입력하세요 : 3
*
**
***
*/
import java.util.Scanner;
class RowTestDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("줄 수를 입력하세요");
		int d = sc.nextInt();
		int i = 1, j = 1;
		do
		{
			i = 1;
				do
			{
				System.out.print("*");
				i++;
			}
			while (i<=j);
			j++;
			System.out.println();
		}
		while (j<=d);
		
	}
}
