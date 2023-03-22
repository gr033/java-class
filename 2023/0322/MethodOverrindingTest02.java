class Person{
	String name;
	String addr;
	public Person(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	public void info(){
		System.out.println(name+", "+addr);
	}
}
class Customer extends Person{
	int no;
	public Customer(String name, String addr, int no){
		super(name, addr);
		this.no = no;
	}
	public void info(){
		System.out.println(no+", "+name+", "+addr);
	}
}
class MethodOverrindingTest02
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("홍길동", "서울", 100);
		c.info();
	}
}
