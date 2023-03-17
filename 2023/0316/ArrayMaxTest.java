/*배열 내 제일 큰 값 출력
1. 배열의 맨 첫번째 값을 가장 크다고 가정(max에 저장)
2. 배열의 요소만큼 반복실행하여 max와 비교하여 그 값이 max보다 크다면 그 값을 max에 저장
*/
class ArrayMaxTest
{
	public static void main(String[] args) 
	{
		int []data = {4, 73, 100, 55, 38};
		int max = data[0];
		for (int i = 1;i<data.length;i++)
		{
			if (max<=data[i])
			{
				max = data[i];
			}
		}


		System.out.println("가장 큰 값 : "+max);
	}
}
