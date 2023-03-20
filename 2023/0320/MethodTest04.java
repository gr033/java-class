class MethodTest05
{
	public static void sayHello(String a, int n){
		for (int i =1;i<=n;i++){
			System.out.println(a+"야 안녕");
		}
		return;
	}
	public static void main(String[] args) 
	{
		sayHello("철수",10);
		String title = "자바 프로그래밍";
		System.out.println(title);
		sayHello("영희",5);
		int year = 2023;
		System.out.println(year);
		sayHello("민수",2);
	}
}
