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

	public void info(){
		System.out.println(name+", "+age+", "+addr);
	}
}

class PersonTest04
{
	public static void main(String[] args) 
	{
		Person p = new Person("name",34,"juso");
		p.info();
	}
}
