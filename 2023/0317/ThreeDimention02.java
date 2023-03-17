/*
2면 3행 5열의 3차원 배열을 만들고 1면에는 모두 0을 저장
2면에는 모두 1을 저장하여 배열의 요소를 모두 출력
*/
class ThreeDimention02
{
	public static void main(String[] args) 
	{
		int a[][][] = new int [2][3][5];
		int n = 0;
		for (int z=0;z<2;z++){
			for (int y=0;y<3;y++){
				for (int x=0;x<5;x++){
					 a[z][y][x] = n;
				}
			}
			n++;
		}

		for (int z=0;z<2;z++){
			for (int y=0;y<3;y++){
				for (int x=0;x<5;x++){
					System.out.print(a[z][y][x]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
