class Movie
{
	private String name;
	private String di;
	private String com;
	public Movie(){
		this.name = "기생충";
		this.di = "봉준호";
		this.com = "CJ";
	}
	public Movie(String name){
		this.name = name;
		this.di = "봉준호";
		this.com = "CJ"; 
	}

	public Movie(String name, String di, String com){
		this.name = name;
		this.di = di;
		this.com = com; 
	}
	public void info(){
		System.out.println("이름 : "+name+"감독 :"+di+"제작사 : "+com);
	}
}
class MovieTest
{
	public static void main(String[] args) 
	{
		Movie m1 = new Movie();
		m1.info();
		Movie m2 = new Movie("박쥐","박찬호","롯데");
		m2.info();
		Movie m3 = new Movie("박쥐");
		m3.info();
	}
}
