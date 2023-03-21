class Person
{
	private String name;
	private int age;
	private String addr;
	public Person(String value, String cName){		//굳이 이렇게 하지는 않는다.
		if(cName.equals("name")){
			this.name = value;
		}
		if(cName.equals("addr")){
			this.addr = value;
		}
	}
	
	public Person(int age){
		System.out.println("생성자 동작함 1");
		this.name = "없음";
		this.age = age;
		this.addr = "없음";
	}
	public Person(String name){
		System.out.println("생성자 동작함 2");
		this.name = name;
		this.age = 0;
		this.addr = "없음";
	}
	public Person(String name, int age){
		System.out.println("생성자 동작함 3");
		this.name = name;
		this.age = age;
		this.addr = "없음";
	}
	public Person(int age, String name){
		System.out.println("생성자 동작함 4");
		this.name = name;
		this.age = age;
		this.addr = "없음";
	}
	public Person(){
		System.out.println("생성자 동작함 5");
		name = "없음";
		age = 0;
		addr = "없음";
	}
	public Person(String name, int age, String addr){
		System.out.println("생성자 동작함 6");
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	/*
	public Person(String addr){
		this.addr = addr;
		this.age = 0;
		this.name = "없음";
	}
	String 매개변수 하나를 갖는 생성자가 이미 있기 때문에 또 정의할 수 없음
	*/
	public void info(){
		System.out.println(name+", "+age+", "+addr);
	}
}

class PersonTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(20);
		p1.info();
		Person p2 = new Person("홍길동");
		p2.info();
		Person p3 = new Person("홍길동", 20);
		p3.info();
		Person p4 = new Person(20, "홍길동");
		p4.info();
		Person p5 = new Person();
		p5.info();
		Person p6 = new Person("김유신", 20, "서울");
		p6.info();
	}
}
