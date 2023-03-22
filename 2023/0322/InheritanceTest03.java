class A
{
	public String title;
	private int year;
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
}
class B extends A{
	public String data;
	public void info(){
		System.out.println("title : "+title);
		System.out.println("year : "+getYear());
		System.out.println("data : "+data);
	}
}
class InheritanceTest03
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.title = "java";
		ob.setYear(2023);
		ob.data = "Hello";
		ob.info();
	}
}