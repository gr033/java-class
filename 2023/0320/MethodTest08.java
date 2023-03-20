//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드 정의

class MethodTest08
{
	public static int getmax(int a, int b){
		int max = a;
		if (b>a)
		{max = b;}
		return max;
	}
	public static void main(String[] args) 
	{
		int r = getmax(10,20);
		System.out.println(r);
		int r2 = getmax(34,35);
		System.out.println(r2);
		System.out.println(getmax(12,23));
	}
}