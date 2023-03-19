import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int sum = 0;
		int max = x;
		
		if(x==y &&y==z) {
			sum = 10000+x*1000;
		}
		else if (x==y || x==z) {
			sum = 1000+x*100;
		}
		else if (y==z) {
			sum = 1000+100*y;
		}
		else {
			if (y>x&&y>z) {
				max = y;
			}
			else if(z>x &&z>y) {
				max = z;
			}
			sum = max*100;
		}
		System.out.println(sum);
	}
}