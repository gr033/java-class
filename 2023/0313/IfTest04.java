//if 조건식이 참일때 실행시키고자하는 명령이 2개 이상이면 중괄호로 반드시 묶어줘야 한다
//else 일때에 실행시키고자하는 명령이 2개 이상이면 중괄호로 반드시 묶어줘야 한다
//실행시킬 명령어가 1개이면 중괄호로 묶는 것은 선택사항(헷갈리면 무조건 사용하기)
//

class IfTest04 
{
	public static void main(String[] args) 
	{
		int age = 20;
		if(age>=30){
			System.out.println("a");}
			else{
				System.out.println("b");
				System.out.println("c");
			}
		
		System.out.println("종료");
	}
}
