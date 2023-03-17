/*객관식 문제의 시험점수를 채점하는 클래스 Exam을 작성
시험에는 5개의 객관식문제와 답이 저장되어있다. 
정답수, 오답수 같은것만 출력, 3개 이상 맞으면 합격
*/
import java.util.Scanner;
class Exam02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char answer[] = {'a', 'b', 'c', 'd', 'c'};
		char student[] = new char[5];

		System.out.println("문제 1 : 15+14 = ?");
		System.out.println("(a)29  (b)26  (c)28  (d)30");
		student[0] = sc.next().charAt(0);
		System.out.println("문제 2 : 15^2 = ?");
		System.out.println("(a)230  (b)225  (c)215  (d)205");
		student[1] = sc.next().charAt(0);
		System.out.println("문제 3 : 65*3 = ?");
		System.out.println("(a)185  (b)215  (c)195  (d)205");
		student[2] = sc.next().charAt(0);
		System.out.println("문제 4 : root(144) = ?");
		System.out.println("(a)11  (b)15  (c)13  (d)12");
		student[3] = sc.next().charAt(0);
		System.out.println("문제 5 : 5! = ?");
		System.out.println("(a)123  (b)130  (c)120  (d)124");
		student[4] = sc.next().charAt(0);
		
		System.out.println("****************시험결과****************");
		int o = 0, x = 0;
		System.out.println("정답");

		for (int i = 0;i<student.length;i++){
			System.out.print(answer[i]+"\t");	
		}
		System.out.println();
		System.out.println("제출한 답");
		for (int i = 0;i<student.length;i++){
			System.out.print(student[i]+"\t");
		}
		System.out.println();

		for (int i=0;i<student.length;i++){
			if(student[i] == answer[i]){
				System.out.print("O\t");
				o++;
			}
			else{
				System.out.print("X\t");
				x++;
				}
		}
		System.out.println();
		System.out.println("-----------------------------");

		System.out.println("정답 수 : "+o);
		System.out.println("오답 수 : "+(student.length-o));
		System.out.println("-----------------------------");

		if (o>=3){
			System.out.println("합격");
		}
		else{System.out.println("불합격");}
	}
}
