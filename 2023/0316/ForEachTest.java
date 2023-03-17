class ForEachTest
{
	public static void main(String[] args) 
	{
		String []name = {"홍길동", "이순신", "유관순", "강감찬", "김유신"};
		for (String n : name )
		{
			System.out.println(n);
		}
		System.out.println("----------------------");

		for (int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}



		/*
		int []data = {10, 20, 30, 40, 50};

		for(int n : data){						//배열의 원소 이용
			System.out.println(n);
		}
		System.out.println("----------------------");

		for (int i = 0;i<data.length;i++)		//인덱스 이용
		{
			System.out.println(data[i]);
		}
		*/
	}
}
