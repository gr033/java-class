class IntTest 
{
	public static void main(String[] args) 
	{
		byte a = 127;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		
	}
}
/*
C:\javaTest\day0310>javac IntTest.java
IntTest.java:7: error: incompatible types: possible lossy conversion from int to byte
                a=a+1;
                   ^
1 error
-> byte�� ������ �� �ִ� �ִ��� �Ѿ��� ������ ������ �� ����
*/