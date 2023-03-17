/*
사용자로부터 정수를 입력받아 배열에 저장하고 출력하는 프로그램을 작성하여보자
*/import java.util.Scanner;
class TestArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		//10개의 정수를 저장할 수 있는 배열을 선언하고 생성하라 
		int []a = new int [10];
		System.out.println("정수 10개를 입력하세요.");	//사용자로부터 정수를 받아서 배열에 저장하는 반복루프
		for (int i = 0;i<a.length;i++){
			System.out.print((i+1)+"번째 : ");
			a[i] = sc.nextInt();
		}
		for (int j=a.length-1;j>=0;j--){			//배열에 저장된 정수를 역순으로 출력하여보라
			System.out.println(a[j]);
		}
	}
}
/*
		for (int i = 0;i<a.length;i++){				//사용자로부터 정수를 받아서 배열에 저장하는 반복루프
			System.out.println((i+1)+"번째 : ");
			a[i] = sc.nextInt();
		}

		for (int j =1;j<a.length;j++){				//배열에 저장된 정수를 출력하는 반복루프
			System.out.println(a[j]);
*/
/*
		for(int i:a){								배열에 저장된 정수를 출력할 때, for-each반복 구조를 사용하여보라
			System.out.println(i);
		}
*/