class CallByValueTest
{
	public static void add(int n){				//n이 data값을 받아서 별도의 공간에 저장
		n = n+1;
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		int data;
		data = 20;
		System.out.println(data);
		add(data);
		System.out.println(data);
	}
}
