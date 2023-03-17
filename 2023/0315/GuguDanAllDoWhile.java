//사용자에게 출력할 단을 입력받아 해당 구구단 do while문 이용하여 출력
class GuguDanAllDoWhile
{
	public static void main(String[] args) 
	{
		int dan = 2, i = 1;
		
		do
		{
			System.out.println(dan+"단");
			i = 1;
			do
			{
				System.out.println(dan+"*"+i+"="+(dan*i));
				i++;
			}
			while (i<=9);
			dan++;
			System.out.println();
		}
		while (dan<=9);
		System.out.println("출력 완료");
	}
}
