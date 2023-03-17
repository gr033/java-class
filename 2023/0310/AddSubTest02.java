class AddSubTest02
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		int a = ++i;				//i값 증가(저장) 후 저장
		int b = j++;				//저장 후 j값 증가(저장)
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
