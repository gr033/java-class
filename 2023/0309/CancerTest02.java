import java.util.Scanner;
class  CancerTest02
{
	public static void main(String[] args) 
	{
		String name;
		int age, userYear, thisYear;
		thisYear = 2023;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요(영문표기) ->");
		name = sc.next();
		System.out.println("출생년도를 입력하세요 ->");
		userYear = sc.nextInt();
		age = thisYear - userYear;
		
		if(age >= 40)
		{
			System.out.println(name+"님은 "+ age +"세이므로 무료 암검진 대상자입니다");
		}
		else
		{
			System.out.println(name+"님은 "+ age +"세이므로 무료 암검진 대상자가 아닙니다");
		}
	}
}
