//사용자가 입력한 문자열에서 각각의 문자들이 나타나는 횟수를 출력
import java.util.Scanner;
class CountLetter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count[] = new int[26];

		System.out.println("문자열을 입력하시오 : ");
		String buffer = sc.nextLine();
		for(int i=0;i<buffer.length();i++)
		{
			char ch = buffer.charAt(i);
			if (ch != ' ')
			{
				count[ch-'a']++;
			}
		}

		for (int i = 0;i<count.length;i++)
		{
			System.out.println((char)('a'+i)+"->"+count[i]);
		}
	}
}