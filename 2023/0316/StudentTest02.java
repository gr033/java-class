//어떤 학생 1명의 점수를 입력받아 출력하는 프로그램
import java.util.Scanner;
class StudentTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		System.out.println("학생의 점수를 입력하세요");
		score = sc.nextInt();
		System.out.println("입력한 학생의 점수 : "+score);

	}
}
