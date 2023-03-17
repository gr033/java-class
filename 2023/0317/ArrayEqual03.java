class ArrayEqual03
{
	public static void main(String[] args) 
	{
		int []a = {10, 20, 30, 40, 50};
		int []b = {10, 20, 30, 40, 50};

		boolean flag = true;

		for (int i = 0;i<a.length;i++)
		{
			if(a[i]!=b[i]){
				flag = false;
				break;
			}
		}
		if(flag == true){System.out.println("같아요");}
		else{System.out.println("달라요");}
	}
}
