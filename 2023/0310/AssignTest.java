class AssignTest 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int sum = 0;

		i++;		//i = i + 1;
		sum += i;	//sum = sum + i;
		i++;
		sum += i;
		i++;
		sum += i;

		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}
}
