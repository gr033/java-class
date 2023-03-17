class GugudanAllTest 
{
	public static void main(String[] args) 
	{
		int dan=2;
		while (dan<=9){
			int i = 1;
			System.out.println(dan+"단");
			while (i<=9){
				System.out.println(dan+"*"+i+"="+(dan*i));
				i++;
			}
			System.out.println();
			dan++;
		}
	}
}
