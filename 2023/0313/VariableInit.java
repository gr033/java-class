//변수는 반드시 값이 있어야 사용할 수 있다.
//변수를 선언하고 값이 있는 상태여야 출력하거나 어떤 연산을 수행할 수 있다
//변수에 처음으로 값을 정해주는 것을 초기화, 값을 "초기값"이라고 한다
class VariableInit 
{
	public static void main(String[] args) 
	{
//		int age;
		String name;
		System.out.println(name);
		
	}
}

/*
C:\javaTest\day0313>javac VariableInit.java
VariableInit.java:9: error: variable age might not have been initialized
                System.out.println(age);
                                   ^
1 error
*/