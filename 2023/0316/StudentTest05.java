/*사용자로부터 몇명의 점수를 입력받는지 물어본 다음 그 만큼의 배열을 생성하고 점수를 입력받아
평균점수를 계산하여 출력
*/
import java.util.Scanner;
class StudentTest05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명을 입력할까요?");
		int num = sc.nextInt();
		int []score = new int[num];
		double sum = 0;
		for (int i = 0;i<num;i++)
		{
			System.out.print((i+1)+"번째 학생의 점수 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}	

		System.out.println("***********결과************");
		for (int i = 0;i<num;i++)
		{
			System.out.println((i+1)+"번째 학생의 점수 : "+ score[i]);
			sum += score[i];
		}	
		System.out.println("--------------------------");
		System.out.println("평균 점수 : "+(sum/num));
	}
}
