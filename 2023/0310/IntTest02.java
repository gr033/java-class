class IntTest02 
{
	public static void main(String[] args) 
	{
		byte a = 127;
		System.out.println(a);
		a = (byte)(a+1);		//overflow
		System.out.println(a);
		byte b = -128;
		b=(byte)(b-1);			//underflow
		System.out.println(b);
	}
}
