/*
다음과 같이 동작하는 프로그램
n을 입력하세요 (5)
5*4*3*2*1 = ()
*/
import java.util.Scanner;
class FactorialTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요.");
		int n = sc.nextInt();
		int result=1;
		for (int i=n ; i>=1 ; i--){result = result*i;
		System.out.print(i);
		if(i!=1){System.out.print("*");}}
		System.out.print("="+result);
	}
}
