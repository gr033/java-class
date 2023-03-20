/*두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 출력
*/
class MethodTest07
{
	public static void max(int a, int b){
		int bigger = a;
		if (b>a)
		{bigger = b;}
		System.out.println(bigger);
	}
	public static void main(String[] args) 
	{
		max(4,5);
		max(50,4);
	}
}
