class A{
	public A(String title){
	}
}
class B extends A{
	public B(String title){
		super(title); 
	}
}
class InheritanceSuper06
{
	public static void main(String[] args) 
	{
		B ob = new B("Hello");

	}
}