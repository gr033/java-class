import java.util.Scanner;
class NumTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, tens, ones;
		String kor = "";
		System.out.println("0~99까지의 숫자를 입력하세요.");
		n = sc.nextInt();
		if(n<0 || n>99){System.out.println("입력범위를 초과했습니다.");return;}
		if (n==0){System.out.println("영");return;}
		tens = n/10;
		ones = n%10;
		switch (tens){
		case 0:kor = ""; break;
		case 1:kor = "십";break;
		case 2:kor = "이십";break;
		case 3:kor = "삼십";break;
		case 4:kor = "사십";break;
		case 5:kor = "오십";break;
		case 6:kor = "육십";break;
		case 7:kor = "칠십";break;
		case 8:kor = "팔십";break;
		case 9:kor = "구십";break;}
		switch (ones){
		case 0:kor += "";break;
		case 1:kor += "일";break;
		case 2:kor += "이";break;
		case 3:kor += "삼";break;
		case 4:kor += "사";break;
		case 5:kor += "오";break;
		case 6:kor += "육";break;
		case 7:kor += "칠";break;
		case 8:kor += "팔";break;
		case 9:kor += "구";break;}
		System.out.println(kor);
	}
}
