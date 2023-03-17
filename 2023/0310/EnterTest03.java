import java.util.Scanner;
class  EnterTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age;
		double height;
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		System.out.println("키를 입력하세요");
		height = sc.nextDouble();

		if(age >= 20 && height >=150.0){System.out.println("입장가능");}
		else{System.out.println("입장불가능");}
	}
}
