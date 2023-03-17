//변수는 반드시 값이 있어야 사용할 수 있다.
//변수를 선언하고 값이 있는 상태여야 출력하거나 어떤 연산을 수행할 수 있다
//변수에 처음으로 값을 정해주는 것을 초기화, 값을 "초기값"이라고 한다
class VariableInit02
{
	public static void main(String[] args) 
	{
		String result;
		int age = 30;
		if (age >= 20)
		{
			result = "입장가능";
		}
		else 
		{
			result = "입장불가능";
		}
		System.out.println(result);
	}
}
