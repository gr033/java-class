// n이 소수인지 판별
import java.util.Scanner;
class  SoTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, cnt=0, sum=0;
		String result="";

		System.out.println("수를 입력하세요");
		n = sc.nextInt();

		for (int i=1;i<=n;i++)
		{
			
			if (n%i==0)
			{
				sum = cnt++;

				if(sum==1)
				{
					result = "소수임";
				}
				else
				{
					result = "소수아님";
				}
			}
		}

		System.out.println(n + "은 " + result);

	}
}