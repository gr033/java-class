class Person
{
	private String name;
	private int age;
	public Person(String n, int a){
		name = n;
		age = a;
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){	//설정자 setter
		age = a;
	}
	public String getName(){	//접근자 getter
		return name;
	}
	public int getAge(){
		return age;
	}
}
class PersonTest04
{
	public static void main(String[] args) 
	{
		Person kim = new Person("김유신", 20);
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
	}
}