import java.util.Scanner;
class TestArray02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []age = new int[5];
		for (int i=0;i<age.length;i++){
			System.out.println("나이를 입력하세요 : ");
			age[i] = sc.nextInt();
		}
		System.out.println("***결과***");
		for(int n : age){
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("--------------------------");

		//배열에 저장된 정수를 역순으로 출력
		for (int i = age.length-1;i>=0;i-- )
		{
			System.out.print(age[i]+" ");
		}
	}
}
