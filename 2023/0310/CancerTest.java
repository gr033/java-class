import java.util.Scanner;
import java.util.Date;
class CancerTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisYear = today.getYear()+1900;	//올해연도 알아오는것 (1900더해야됨)
		int userYear, age;
		String name;

		System.out.println("***무료 암검진 대상 판별 프로그램***");
		System.out.println("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.println("출생연도를 입력해주세요 : ");
		userYear = sc.nextInt();
		age = thisYear - userYear;
		System.out.println("***판별결과***");
		System.out.println("올해 연도 : "+thisYear);
		System.out.println("출생 연도 : "+userYear);
		System.out.println("나이 : "+age);
		if(age >= 40){System.out.println(name + "님, 무료 암검진 대상자입니다");}
		else{System.out.println(name + "님, 무료 암검진 대상자가 아닙니다");}
	}
}
