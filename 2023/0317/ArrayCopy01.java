class ArrayCopy01
{
	public static void main(String[] args) 
	{
		int []a = {1, 2, 3, 4, 5};
		int []b = new int [5];
		for (int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("a배열의 요소");
		for (int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for (int j:b){
			System.out.print(j+" ");
		}

		a[0] = 100;
		System.out.println();
		System.out.println("--------------");
		System.out.println("a배열의 요소");
		for (int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for (int j:b){
			System.out.print(j+" ");
		}
	}
}