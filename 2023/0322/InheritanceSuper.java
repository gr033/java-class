class A{
	
}
class B extends A{

}
class InheritanceSuper
{
	public static void main(String[] args) 
	{
		A ob = new A();
		B ob2 = new B();
		System.out.println("ok");
	}
}
//A클래스에 기본 생성자가 제공되고 B클래스에도 기본 생성자가 제공되기 때문에 위와 같이 객체를 생성할 수 있음
