class BitTest 
{
	public static void main(String[] args) 
	{
		int a = 6;				//110
		int b = 7;				//111
		int i = a&b;
		int j = a|b;
		int k = a^b;
		System.out.println(i);	//110 ->6
		System.out.println(j);	//111 ->7
		System.out.println(k);	//001 ->1
	}
}
