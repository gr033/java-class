//가위바위보게임
import java.util.Random;
import java.util.Scanner;
class GameTest02
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int com = r.nextInt(3);
		System.out.println("가위 : 0, 바위 : 1, 보 : 2");
		System.out.println("입력하세요 : ");
		int user = sc.nextInt();
		System.out.println("컴퓨터 : " + com);
		if (com == user){
			System.out.println("비겼습니다.");
		}
		else if ((user==0 && com==2)||(user==1 && com==0)||(user==2 && com==1)){
			System.out.println("이겼습니다.");
		}
		else{
			System.out.println("졌습니다.");
		}
	}
}
