class ArrayEqual02
{
	public static void main(String[] args) 
	{
		int []a = {10, 20, 30, 40, 50};
		int []b = {10, 20, 30, 40, 50};
		for (int i = 0;i<a.length;i++)
		{
			if(a[i]!=b[i]){
				System.out.println("달라요");
				return;
			}
		}
		System.out.println("같아요");
	}
}
