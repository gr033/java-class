//사용자에게 구구단 몇단을 출력할지 입력받아 해당 구구단을 출력하는 프로그램(while문 사용)
import java.util.Scanner;
class GugudanWhile
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		int n = sc.nextInt();
		int i = 1;
		if (n<1){System.out.println("입력오류");return;}
		while (i <=9){
			System.out.println(n+"*"+i+"="+ (n*i));
			i++;
		}
	}
}
