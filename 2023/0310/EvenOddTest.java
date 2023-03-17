import java.util.Scanner;
class EvenOddTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String result;
		System.out.println("숫자를 입력하세요>");
		n = sc.nextInt();
		if(n%2==0){
			result = "짝수";
		}
		else{
			result = "홀수";
		}
		System.out.println("입력한 숫자"+n+"은(는) "+result+"입니다.");
	}
}
