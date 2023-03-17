/*5행 5열의 2차원 배열을 만들고 1부터 1씩 증가하는 값을 각 배열의 요소에 저장
단, 마지막 열에는 각 행의 합이 누적이 되도록 한다.
[1][2][3][4][10]
[5][6][7][8][]
[9][10][11][12][]
[13][14][15][16][]
*/
class MatrixTest02
{
	public static void main(String[] args) 
	{
		int a[][] = new int[5][5];
		int n = 1;
		for (int y=0;y<5;y++)
			{
			for (int x=0;x<4;x++)
			{
				a[y][x] = n++;
				a[y][4] += a[y][x];
			}
		}
		for (int y=0;y<5 ;y++ )
		{
			for (int x=0;x<5;x++)
			{
				System.out.print(a[y][x]+"\t");
			}
			System.out.println();
		}
	}
}
