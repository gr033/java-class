
class ContinueTest
{
	public static void main(String[] args) 
	{
		int i = 0;
		for (i = 1;i <=10;i++)
		{
			if (i%4 == 0)
			{
			continue;
			}

			System.out.println(i);
		}
		System.out.println("작업종료");
		System.out.println(i);
	}
}
