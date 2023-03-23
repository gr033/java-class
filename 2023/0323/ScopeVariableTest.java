class Myutil{
	public int year=2023;
	public void pro(){
		int n = 5;
		int a = 7;
		n++;
		year++;
		System.out.println();
		System.out.println(n+", "+a+", "+year);
	}
	public void test(){
		int n = 100;
		System.out.println("year: "+year);
		System.out.println(n);
		System.out.println(a);
	}

}
class ScopeVariableTest
{
	public static void main(String[] args) 
	{
		Myutil util = new Myutil();
		util.pro();
		util.test();
	}
}
