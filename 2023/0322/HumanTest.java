class Human
{
	protected String name;
	protected int age;
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String toString(){
		return name+", "+age;
	}
	public String getProfession(){
		return "모름";
	}
}
class Student extends Human{
	private String major;
	public Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		return name+", "+age+", "+major;
	}
	public void pro(){
		System.out.println(super.toString());	//부모의 매개변수 사용
	}
	public String getProfession(){
		return "학생";
	}
}
class HumanTest
{
	public static void main(String[] args) 
	{
		Human p1 = new Human("춘향", 18);
		Human p2 = new Human("몽룡", 21);
		Human p3 = new Human("사또", 50);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경제");
		System.out.println(s1.toString());		//toString()생략 가능
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		s1.pro();
		System.out.println(s1.getProfession());
	}
}