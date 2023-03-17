/*
다음과 같이 동작하는 프로그램
n을 입력하세요 (5)
5*4*3*2*1 = ()
*/
import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요.");
		int n = sc.nextInt();
		int result=1, i;
		for (i=1 ; i<=n ; i++){result = result*i;}
		for(i=n ; i>=2 ; i--){System.out.print(i+"*");}
		System.out.print(i+"="+result);
	}
}
