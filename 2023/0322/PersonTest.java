class Person
{
	protected String name;
	protected String addr;
	protected String phone;
	public String getPhone(){
		return phone;
	}
	public String getAddr(){
		return addr;
	}
	public String getName(){
		return name;
	}
	public void setPhone(String Phone){
		this.phone = phone;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public Person(){
	}
	public Person(String name, String addr, String phone){
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
}
class Customer extends Person
{
	private int no;
	private double mileage;
	public Customer(String name, String addr, String phone, int no, double mileage){
		super(name, addr, phone);
		this.no = no;
		this.mileage = mileage;
	}
	public void setNo(int no){
		this.no = no;
	}
	public void setMileage(double mileage){
		this.mileage = mileage;
	}
	public int getNo(){
		return no;
	}
	public double getMileage(){
		return mileage;
	}
}
class PersonTest
{
	public static void main(String[] args) 
	{
		Person p = new Person("홍길동", "서울", "010-1234-5678");
		Customer c = new Customer("김유신", "부산", "010-9876-5432", 100, 10000);
		System.out.println(p.getName());
		System.out.println(p.getAddr());
		System.out.println(p.getPhone());
		System.out.println();
		System.out.println(c.getName());
		System.out.println(c.getAddr());
		System.out.println(c.getPhone());
		System.out.println(c.getNo());
		System.out.println(c.getMileage());
	}
}
