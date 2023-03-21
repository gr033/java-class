class Person
{
	private String name;
	private int age;
	private String addr;

	public void info(){
		System.out.println(name+", "+age+", "+addr);
	}
}

class PersonTest03
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.info();
	}
}
