class Person
{
	String name;
	int age;
	static String addr;
}
class StaticTest
{
	public static void main(String[] args) 
	{
		Person.addr = "서울시 마포구 서교동";		//객체가 없으므로 class이름으로 접근
		System.out.println(Person.addr);
	}
}
