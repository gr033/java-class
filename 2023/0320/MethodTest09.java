//임의의 수 n을 매개변수로 전달받아 1~n까지의 합을 누적하여 변환하는 메소드를 정의하고 호출
class MethodTest09
{
	public static int plus(int x){
		int sum = 0;
		for (int i=1;i<=x;i++)
		{
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int r1 = plus(5);
		int r2 = plus(10);
		System.out.println(r1);
		System.out.println(r2);
	}
}
