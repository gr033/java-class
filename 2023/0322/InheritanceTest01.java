class A
{
	public String title;
	public int year;
}
class B extends A{
	public String data;
}
class InheritanceTest01
{
	public static void main(String[] args) 
	{
		A ob1 = new A();
		B ob2 = new B();
		ob1.title = "java";
		ob1.year = 2023;
		ob2.title = "oracle";
		ob2.year = 2022;
		ob2.data = "Hello";
		System.out.println(ob1.title);
		System.out.println(ob1.year);
		System.out.println();
		System.out.println(ob2.title);
		System.out.println(ob2.year);
		System.out.println(ob2.data);
	}
}
