//사용자에게 나이를 입력받아 나이가 20살 이상이면 입장가능을 출력, 그렇지 않으면 입장불가를 출력
import java.util.Scanner;
class PassTest
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
	
		if(age>=20){
		System.out.println("입장가능");
		}
		else{
		System.out.println("입장불가");
		}
	}
}
