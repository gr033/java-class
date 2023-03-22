class A{
	public A(String title){
		
	}
}
class B extends A{

}
class InheritanceSuper04
{
	public static void main(String[] args) 
	{
		B ob = new B();

	}
}
/* A클래스에 매개변수를 갖는 기본 생성자가 생성 ->B클래스에 A클래스의 기본생성자를 요구하기 때문에 에러
==>A클래스에 매개변수를 갖는 생성자를 만들었기 때문에 기본 생성자가 제공되지 않습니다.
그러나 자식클래스의 생성시에 부모의 기본생성자를 요구하기 대문에 에러가 발생합니다.
InheritanceSuper04.java:6: error: constructor A in class A cannot be applied to given types;
class B extends A{
^
  required: String
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/