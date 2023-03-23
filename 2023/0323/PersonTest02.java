import java.util.Scanner;
class Person{
	String name;
	int age;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){}
	public String toString(){
		return name+", "+age;
	}
}
class PersonTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println("이름: ");
		p.setName(sc.next());
		System.out.println("나이: ");
		p.setAge(sc.nextInt());
		
		System.out.println(p.toString());

	}
}
