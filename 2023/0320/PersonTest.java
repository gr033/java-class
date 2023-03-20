/*
사람 Person
속성 	이름 String name = "홍길동"
	나이 int age = 20;
동작 	먹는다 eat(String food)
	잔다 sleep()
*/
class Person
{
	String name;
	int age;
	public void eat(String food){
		System.out.println(age+"살 "+name+"이(가) "+food+"를 먹어요");
	}

	public void sleep(){
		System.out.println(age+"살 "+name+"이(가) 자요");
	}
}
class PersonTest
{
	public static void main(String[] args) 
	{
		Person kim;
		kim = new Person();
		kim.name = "홍길동";
		kim.age = 29;
		kim.eat("햄버거");
		kim.sleep();
	}
}