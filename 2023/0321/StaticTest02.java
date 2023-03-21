class Person
{
	String name;
	int age;
	static String addr;
}
class StaticTest02
{
	public static void main(String[] args) 
	{
		Person.addr = "서울시 마포구 서교동";		//객체가 없으므로 class이름으로 접근
		System.out.println(Person.addr);
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "이순신";
		p1.age = 40; 
		p2.name = "김유신";
		p2.age = 25;
		System.out.println(p1.name+", "+p1.age+", "+p1.addr);
		System.out.println(p2.name+", "+p2.age+", "+p2.addr);

		p1.addr = "제주도 서귀포시";
		System.out.println("==============================");
		System.out.println(p1.name+", "+p1.age+", "+p1.addr);
		System.out.println(p2.name+", "+p2.age+", "+p2.addr);

	}
}
