//2~100 안의 모든 소수를 찾는 프로그램
class SosuTest02
{
	public static void main(String[] args) 
	{
		int i = 4;
		int cnt = 0;
		for (int j=1;j<=i;j++)
		{
			if(i%j==0)
				{
				cnt++;
			}
		}
		if (cnt ==2)
		{
			System.out.println(i);
		}

		
	}
}

/*

		for (int i = 2; i<=100 ; i++)
		{
			int cnt = 0;
			for(int j = 1; j<=i ; j++){
				if(i%j == 0){cnt ++;}
			}
			if (cnt == 2)
				{System.out.print(i+" ");
			}
		}
*/