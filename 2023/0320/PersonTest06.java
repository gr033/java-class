class Person
{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void info(){
		System.out.println("이름 : "+name+", 나이 : "+age);
	}
}
class PersonTest06
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("김유신", 30);
		p1.info();
		p1.setName("김유신");
		p1.info();
		System.out.println(p1.getName());
	}
}