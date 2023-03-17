class SyntaxError03
{
	public static void main(String[] args) 
	{
		String name = "홍길동";
		int age  20;
		System.out.println(age);
		System.out.println(name);
	}
}
/*
C:\javaTest\day0313>javac SyntaxError03.java
SyntaxError03.java:6: error: ';' expected
                int age  20;
*/