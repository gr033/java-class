class Person
{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
		name = "홍길동";
		age = 20;
	}
	public Person(String name){
		this.name = name;
		age = 20;
	}
	public Person(int age){
		name = "홍길동";
		this.age = age;
	}
	public void info(){
		System.out.println("이름 : "+name+", 나이 : "+age);
	}
}
class PersonTest07
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("김유신", 30);
		Person p2 = new Person();
		Person p3 = new Person("김유신");
		Person p4 = new Person(30);
		p1.info();
		p2.info();
		p3.info();
		p4.info();
	}
}