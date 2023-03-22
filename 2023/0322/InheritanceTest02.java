class A
{
	public String title;
	public int year;
}
class B extends A{
	public String data;
	public void info(){
		System.out.println("title : "+title);
		System.out.println("year : "+year);
		System.out.println("data : "+data);
	}
}
class InheritanceTest02
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.title = "java";
		ob.year = 2023;
		ob.data = "Hello";
		ob.info();
	}
}
/*year를 private로 할 시 에러 발생(자식 클래스라 해도 부모의 private영역에는 접근 불가능)
InheritanceTest02.java:10: error: year has private access in A
                System.out.println("year : "+year);
                                             ^
InheritanceTest02.java:20: error: year has private access in A
                ob.year = 2023;
*/