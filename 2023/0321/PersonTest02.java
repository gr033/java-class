class Person
{
	private String name;
	private int age;
	private String addr;
	public Person(){
		name = null;
		age = 0;
		addr = null;
	}

	public void info(){
		System.out.println(name+", "+age+", "+addr);
	}
}

class PersonTest02
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.info();
	}
}
