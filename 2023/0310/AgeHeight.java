//사용자에게 나이와 키를 입력받아 나이가 20살 이상이고, 키가 150이상이면 "입장가능", 
//그렇지 않으면 "입장 불가능을 출려"
import java.util.Scanner;
class AgeHeight
{
	public static void main(String[] args) 
	{
		int age, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		System.out.println("키를 입력하세요.");
		height = sc.nextInt();

		if(age >= 20 && height >= 150){
			System.out.println("입장가능");
		}
		else{
			System.out.println("입장불가능");
		}
	}
}