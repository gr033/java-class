//4지선다형 문항의 답안 10개를 입력받아 답이 옳은지 판별하여 맞으면 o, 틀리면 x로 출력하고
//정답수와 틀린 답수를 각각 구하여 출력하는 프로그램
import java.util.Scanner;
class StudentTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []dap = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
		int []user = new int[10];
		for (int i = 0;i<user.length;i++){
			System.out.print((i+1)+"번 답 : ");
			user[i] = sc.nextInt();
		}
		System.out.println("***시험 결과***");
		int o = 0;
		for (int i=0; i<user.length;i++){
			System.out.print((i+1)+"\t");
		}
		System.out.println();
		for (int i=0;i<user.length;i++){
			if (user[i] == dap[i]){
				System.out.print("O\t");
				o++;
			}
			else{
				System.out.print("X\t");
			}
		}
		System.out.println();
		System.out.println("정답 수 : "+o);
		System.out.println("오답 수 : "+(user.length-o));
	}
}
