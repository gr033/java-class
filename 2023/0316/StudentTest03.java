//5명의 이름, 점수를 입력받아 가장 높은 점수의 학생이름을 출력
import java.util.Scanner;
class StudentTest03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []score = new int[5];
		
		for (int i = 0; i<name.length;i++){
			System.out.print((i+1)+"번째 학생 이름 : ");
			name[i] = sc.next();
			System.out.print("점수 : ");
			score[i] = sc.nextInt();
		}
		System.out.println("*** 결과 ***");
		System.out.println("이름\t점수");
		for (int i =0;i<name.length;i++){
			System.out.println(name[i]+"\t"+score[i]);
		}

		int max;
		String max_name;

		max = score[0];
		max_name = name[0];
		for (int i = 1;i<name.length;i++){
			if (score[i] > max){
				max = score[i];
				max_name = name[i];
			}
		}
		System.out.println("------------------");
		System.out.println("최고점수 : "+max);
		System.out.println("최고점수의 이름 : "+max_name);
	}
}
