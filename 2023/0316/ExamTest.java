class ExamTest
{
	public static void main(String[] args) 
	{
		int []numbers = new int[5];
		for (int i=0;i<5;i++)
		{
			numbers[i] = i+1;
		}
		for(int i:numbers )
		{
			System.out.println(numbers[i]);
		}
	}
}
