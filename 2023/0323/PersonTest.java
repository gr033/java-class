import java.util.Scanner;
class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+", "+age;
	}
}
class PersonTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name; 
		int age;
		System.out.println("이름: ");
		name = sc.next();
		System.out.println("나이: ");
		age = sc.nextInt();
		Person p = new Person(name, age);
		System.out.println(p.toString());

	}
}
