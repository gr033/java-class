class Person
{
	private String name;
	private int age;
	private String addr;

	public Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public Person(){
	}

	public void info(){
		System.out.println(name+", "+age+", "+addr);
	}
}

class PersonTest06
{
	public static void main(String[] args) 
	{
		Person p = new Person("name",34,"juso");
		p.info();
		Person p2 = new Person();
		p2.info();
	}
}
