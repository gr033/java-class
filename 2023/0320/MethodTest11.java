//실수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 반환하는 메소드를 정의

class MethodTest11
{
	public static double getMax(double []a){
		double max = a[0];
		for (int i=1;i<a.length;i++){
			if (a[i]>a[i-1])
			{
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		double r1[] = {1.5, 2.3, 3.8, 4.4, 5.7};
		double r2 = getMax(r1);
		System.out.println(r2);
		System.out.println(getMax(r1));
	}
}
