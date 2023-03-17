/*임의의 수 n을 입력받아 1~n까지의 짝수의 합, 짝수의 수, 
  홀수의 합, 홀수의 수를 각각 구하여 출력하는 프로그램
*/
import java.util.Scanner;
class EvenOddTest 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int even_sum = 0;		//짝수 합
		int even_cnt = 0;		//짝수 갯수
		int odd_sum = 0;		//홀수 합
		int odd_cnt = 0;		//홀수 갯수

		System.out.println("n을 입력하세요.");
		n = sc.nextInt();

		for (int i=1 ; i<=n ; i++){
			if (i%2 == 0){
				even_cnt ++;
				even_sum += i;
			}
			else {
				odd_cnt ++;
				odd_sum += i;
			}
		}
		System.out.println("짝수 합 : "+even_sum);
		System.out.println("짝수 갯수 : "+even_cnt);
		System.out.println("홀수 합 : "+odd_sum);
		System.out.println("홀수 갯수 : "+odd_cnt);
	}
}
