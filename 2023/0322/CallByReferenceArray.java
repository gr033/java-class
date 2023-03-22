class CallByReferenceArray
{
	public static void add(int a[]){
		for (int i = 0;i<a.length;i++){
			a[i] ++;
		}
	}

	public static void main(String[] args) 
	{
		int []data = {10, 20, 30};
		add(data);
		for (int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
}
