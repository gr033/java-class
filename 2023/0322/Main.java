import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		boolean bl;
		int cnt=0;
		for (int i = 0;i<a.length;i++){
				int m = sc.nextInt();
				a[i] = m%42;
			}
		


		for (int i = 0;i<a.length;i++){
			bl = false;
			for(int j=i+1;j<a.length;j++){
				if (a[i] == a[j]){
					bl = true;
					break;
				}
			}
			if (bl==false){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}