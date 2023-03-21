class MyUtil
{
	//정수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 반환하는 메소드를 정의
	public int getMax(int a[]){
		int max = a[0];
		for (int i:a)
		{
			if (i>max)
			{max = i;
			}
		}
		return max;
	}
	//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의
	public int getMax(int a, int b){
		int max = a;
		if (max<b)
		{max = b;
		}
		return max;
	}
	//두개의 실수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의
	public double getMax(double a, double b){
		double max = a;
		if (max<b)
		{
			max = b;
		}
		return max;
	}
}
class MethodOverloadingTest
{
	public static void main(String[] args) 
	{
		MyUtil util = new MyUtil();
		System.out.println(util.getMax(20, 30));
		System.out.println(util.getMax(22.5, 33.4));
		int a[] = {9, 3, 5, 8, 2, 12};
		System.out.println(util.getMax(a));
	}
}
