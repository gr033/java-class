class MatrixTest
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int [3][4];
		/*
		 0 1 2 3
		0[][][][]
		1[][][][]	3줄 4칸
		2[][][][]   0,0부터 3,2까지 차례로 1~12까지 저장
		*/
		int n = 1;
		for (int i = 0;i<3;i++)		//줄 수를 위한 반복문
		{
			for (int j = 0;j<4;j++)	//칸 수를 위한 반복문
			{
				 a[i][j]= n;
				 n++;
			}
		}
		for (int i = 0;i<3;i++)
		{
			for (int j = 0;j<4;j++)
			{System.out.print(a[i][j]+"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
