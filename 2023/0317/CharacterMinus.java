class CharacterMinus
{
	public static void main(String[] args) 
	{
		char ch = 'b';
		System.out.println(ch-'a');

		int []data = new int[5];
		data[ch-'a']++;
		System.out.println(data[0]);
		System.out.println(data[1]);
	}
}
