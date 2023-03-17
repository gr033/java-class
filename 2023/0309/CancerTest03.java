//오늘 날짜의 연도 적용
import java.util.Scanner;
import java.util.Date;
class  CancerTest03
{
	public static void main(String[] args) 
	{
		Date today = new Date();
		String name;
		int age, userYear, thisYear;
		thisYear = today.getYear()+1900;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요(영문표기) ->");
		name = sc.next();
		System.out.println("출생년도를 입력하세요 ->");
		userYear = sc.nextInt();
		age = thisYear - userYear;
		
		System.out.println("***처리결과***");
		System.out.println("이름 : " + name);
		System.out.println("올해연도 : " + thisYear);
		System.out.println("출생연도 : " + userYear);
		System.out.println("나이 : " + age);
		if(age >= 40)
		{
			System.out.println(name+"님은 무료 암검진 대상자입니다");
		}
		else
		{
			System.out.println(name+"님은 무료 암검진 대상자가 아닙니다");
		}
	}
}
