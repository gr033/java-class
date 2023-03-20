//정수형 변수를 매개변수로 전달받아 총 합을 누적하여 반환하는 메소드를 정의

class MethodTest10
{
	public static int getSum(int []a){
		int sum = 0;
		for (int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int r1[] = {1, 2, 3, 4, 5};
		int r2 = getSum(r1);
		System.out.println(r2);
		System.out.println(getSum(r1));
	}
}
