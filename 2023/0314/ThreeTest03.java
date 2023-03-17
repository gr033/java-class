//특정 정수를 읽어들여서 0과 이 정수 사이에 있는 모든 3의 배수를 출력
//정수값이 0보다 작으면 오류메세지
import java.util.Scanner;
class ThreeTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를입력하세요");
		int n = sc.nextInt();
		String r = "0과" +n+"사이의 3의 배수는 ";
		if (n<0)
		{
			System.out.println("입력 오류");
			return;
		}
		for (int i = 1; i <=n ; i++)
		{	
			if (i%3 == 0)
			{
				r = r+i+",";
			}
		}
		r = r.substring(0,r.length()-1);
		System.out.println(r);
	}
}
