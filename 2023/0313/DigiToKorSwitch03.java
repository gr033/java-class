import java.util.Scanner;

class DigiToKorSwitch03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9사이의 수 입력");
		n = sc.nextInt();
		switch (n)
		{
			case 7:
			case 0:
			case 1:
			case 2:
				System.out.println("이");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("오");
				break;
			case 6:			
			case 8:
			case 9:
				System.out.println("구");
				break;		
		}
		System.out.println("작업완료");
	}
}
