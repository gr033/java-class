class Person
{
	public String name = "홍길동";
	public static String addr = "서울";
	public static void pro(){
		System.out.println(addr);
		//System.out.println(name);
	}
}
class StaticMethod02
{
	public static void main(String[] args) 
	{
		Person.pro();
	}
}
