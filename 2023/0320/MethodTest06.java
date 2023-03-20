class MethodTest06
{
	public static void gugudan(int a){
		for (int i = 1;i<=9;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		gugudan(7);
		gugudan(5);
		gugudan(2);
	}
}
