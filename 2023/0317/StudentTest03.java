import java.util.Scanner;
class StudentTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int []dap = {1,2,3,4,1,2,3,4,1,2};
		int []user = new int[10];

		for(int i=0; i<user.length; i++){
			System.out.println((i+1) + "번 답을 입력");
			user[i] = sc.nextInt();
		}
		for(int i=0; i<user.length; i++){
			System.out.print(user[i] + " ");
		}
		
		boolean []flag = new boolean[10];
		int cnt=0;
	
		for(int i=0; i<user.length; i++){
			if(dap[i] != user[i]){
				flag[i] = false;
			}
			else{
				flag[i] = true;
				cnt++;
			}
		}
		System.out.println();
		for(int i=0; i<user.length; i++){
			if(flag[i] == true){
				System.out.print("o ");
			}else{
				System.out.print("x ");
			}
		}
		System.out.println();
		System.out.println(" ***시험 결과***");
		System.out.println("정답 수 : " + cnt );
		System.out.println("틀린 개수 : "  + (user.length-cnt)); //10-정답개수
	}
}