class Person
{
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class CallByReferenceObject
{	//Person의 객체 참조 변수를 매개변수로 전달받아 나이를 1증가시키는 메소드를 만들
	public static void add(Person p){
		p.age++;
	}
	public static void main(String[] args) 
	{
		Person kim = new Person("김유신", 20);
		add(kim);
		System.out.println(kim.age);
	}
}
