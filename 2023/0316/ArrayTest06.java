class ArrayTest06
{
	public static void main(String[] args) 
	{
		int []a = {4, 6, 30, 12, 41, 20};	//배열선언과 동시에 초기화가능
		System.out.println("배열의 길이 : "+a.length);
		int i=0;
		while (i<a.length)
		{
			System.out.println(a[i]);
			i++;
		}
	}
}