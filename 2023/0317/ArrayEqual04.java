class ArrayEqual04
{
	public static void main(String[] args) 
	{
		int []a = {10, 20, 30, 40, 50};
		int []b = {10, 20, 30, 40, 50, 60, 70, 80};

		boolean flag = true;
		if (a.length != b.length)
		{
			flag = false;
			
			//System.out.println("두 배열의 길이가 같지 않습니다.");
			//return;
		}
		else{
			for (int i = 0;i<a.length;i++)
			{
				if(a[i]!=b[i]){
					flag = false;
					break;
				}
			}
		}
		if(flag == true){System.out.println("같아요");}
		else{System.out.println("달라요");}
	}
}
