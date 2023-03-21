class Dog
{
	private String name;
	public String breed;
	private int age;

	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public void setName(String name){
		this.name = name;
	}
	public Dog(String name, int age){
		this(name, null, age);
	}
	public Dog(String name, String breed, int age){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	public void info(){
		System.out.println("이름 : "+name+", 나이 : "+age+", 종류 : "+breed);
	}
}
class DogTest
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("바둑이", 2);
		Dog d2 = new Dog("나비", "요크셔테리어", 3);
		d1.info();
		d2.info();
	}
}
