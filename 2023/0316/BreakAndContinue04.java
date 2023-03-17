class BreakAndContinue04
{
	public static void main(String[] args) 
	{
		int i = 1;
		while (i<=10)
		{
			if (i%3==0)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("작업완료");
		System.out.println(i);
	}
}
