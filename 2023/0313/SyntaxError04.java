class SyntaxError04
{
	public static void main(String[] args) 
	{
		String name = "홍길동";
		int age = 20;
		System.out.println(age);
		System.out.println(name);
	}}
}
/*
SyntaxError04.java:10: error: reached end of file while parsing
}
 ^
1 error
--->}없을떄

SyntaxError04.java:10: error: class, interface, enum, or record expected
}
^
1 error
--->}하나 더 있을때
*/