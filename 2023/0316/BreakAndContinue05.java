class BreakAndContinue05
{
	public static void main(String[] args) 
	{
		int i = 0;
		while (i<10)
		{
			i++;
			if (i%3==0)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("작업완료");
		System.out.println(i);
	}
}
