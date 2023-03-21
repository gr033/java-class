/*Person class의 멤버 메소드인 sayHello()를 사용하려면 반드시 
Person 클래스의 객체를 생성하고 그 객체를 통해서 사용 가능
*/
class Person
{
	String name;
	public Person(String name){
		this.name = name;
	}
	public static void pro(){
		System.out.println("프로입니다.");
	}
	public void sayHello(){
		System.out.println("Hello, "+name);
	}
}
class StaticMethodTest
{
	public static void main(String[] args) 
	{
		//Person p = new Person("kitty");
		//p.sayHello();
		Person.pro();
		//Person.sayHello();
	}
}
