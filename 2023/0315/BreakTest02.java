class BreakTest02 
{
	public static void main(String[] args) 
	{
		int i = 1;
		for (;;)
		{
			System.out.println("Hello");
			i = i+1;
			if (i>3)
			{
				break;
			}
		}
	}
}
