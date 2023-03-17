import java.util.Scanner;
class SumTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, sum=0;
		System.out.println("n을 입력하세요");
		n = sc.nextInt();
		for (int i=1 ; i<=n ; i++)
		{
			sum = sum+i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum);
	}
}
