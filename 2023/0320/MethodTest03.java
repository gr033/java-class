class MethodTest03
{
	public static void sayHello(){
		for (int i =1;i<=3;i++){
			System.out.println("철수야 안녕");
		}
		return;
	}
	public static void main(String[] args) 
	{
		sayHello();
		String title = "자바 프로그래밍";
		System.out.println(title);
		sayHello();
		int year = 2023;
		System.out.println(year);
		sayHello();
	}
}
