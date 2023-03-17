//연습) 어떤 사람의 태어난 월을 입력받아 계절명을 출력하는 프로그램을 작성
//처리조건 : 3,4,5 -봄, 6,7,8-여름, 9,10,11-가을, 12,1,2-겨울
import java.util.Scanner;
class Birth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int mon;
		System.out.println("몇월에 태어났습니까?");
		mon = sc.nextInt();
		if(mon <0 || mon >12){
		System.out.println("태어난 월을 입력해주세요");
		return;
		}
		if (mon>=1 && mon<=12)
		{
			if (mon >=3 && mon <=5)
			{
				System.out.println("태어난 시기는 봄입니다.");
			}
			else if (mon >=6 && mon <=8)
			{
				System.out.println("태어난 시기는 여름입니다.");
			}
			else if (mon >=9 && mon <=11)
			{
				System.out.println("태어난 시기는 가을입니다.");
			}
			else if (mon == 12 || mon <=2)
			{
				System.out.println("태어난 시기는 겨울입니다.");
			}
		}
	}
}
