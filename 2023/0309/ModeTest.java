import java.util.Scanner;
class Grade
{
	public static void main(String[] args) 
	{
		int a, b, c, d;
		double e;
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터 개론 성적을 입력하시오");
		a = sc.nextInt();
		System.out.println("C언어 프로그래밍 성적을 입력하시오");
		b = sc.nextInt();
		System.out.println("영어 성적을 입력하시오");
		c = sc.nextInt();
		System.out.println("일반 수학 성적을 입력하시오");
		d = sc.nextInt();
		e = (a+b+c+d)/4.0;
		System.out.println("당신의 평균 점수는 "+e+"점 입니다.");
	}
}
