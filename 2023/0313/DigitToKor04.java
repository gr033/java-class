import java.util.Scanner;
class  DigitToKor04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		String result ="";
		System.out.println("0~9중 숫자 한개를 입력하세요");
		a = sc.nextInt();
		
		if ( a>=0 && a<=9)
		{
		if(a == 0 )
		{result = "영";}
		else if(a == 1 )
		{result = "일";}
		else if(a == 2 )
		{result = "이";}
		else if(a == 3 )
		{result = "삼";}
		else if(a == 4 )
		{result = "사";}
		else if(a == 5 )
		{result = "오";}
		else if(a == 6 )
		{result = "육";}
		else if(a == 7 )
		{result = "칠";}
		else if(a == 8 )
		{result = "팔";}
		else if(a == 9)
		{result = "구";}	
		System.out.println("입력한 숫자 "+a+"은(는) 한글 표기식으로 \""+result+"\"입니다.");
		}
		else
		{System.out.println("입력범위를 넘었습니다.");}
	}
}
