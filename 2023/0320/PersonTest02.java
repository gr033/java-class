class Person
{
	private String name;
	private int age;
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
class PersonTest02
{
	public static void main(String[] args) 
	{
		Person kim;
		kim = new Person();
		kim.setName("김유신");
		kim.setAge(20);
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
	}
}
