class A{
	public A(){
		System.out.println("부모 생성자 동작함");
	}
}
class B extends A{
	public B(){
		System.out.println("자식 생성자 동작함");
	}
}
class InheritanceSuper02
{
	public static void main(String[] args) 
	{
		B ob2 = new B();	//부모의 생성자가 먼저 동작하고 자식의 생성자가 동작한다.
		System.out.println("ok");
	}
}
//A클래스에 기본 생성자가 제공되고 B클래스에도 기본 생성자가 제공되기 때문에 위와 같이 객체를 생성할 수 있음
