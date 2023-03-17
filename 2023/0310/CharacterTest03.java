//문자열 데이터 안에 소문자 o가 몇개있는지 판별
class CharacterTest03
{
	public static void main(String[] args) 
	{
		int o=0;
		char ch;
		String data;
		data = "Hello Korea";
		for(int i=0 ; i<data.length() ; i = i+1 )
		{
			ch = data.charAt(i);
			if(ch == 'o')
			{
				o=o+1;
			}

		}
		System.out.println("소문자 o의 갯수는 : "+o);
		
	}
}
