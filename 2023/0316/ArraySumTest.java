//5명의 나이를 배열에 저장
class ArraySumTest
{
	public static void main(String[] args) 
	{
		int []a = {28, 25, 25, 26, 27};			//5명의 평균나이를 계산
		double sum = 0;
		for (int i =0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("5명의 평균 나이는 "+(sum/a.length));
	}
}
