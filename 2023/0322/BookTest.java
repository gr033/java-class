class Book{
	protected String name;
	protected int page;
	protected String author;
	public Book(String name, int page, String author){
		this.name = name;
		this.page = page;
		this.author = author;
	}
	public Book(){
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPage(int page){
		this.page = page;
	}
	public void setAuthor(String Author){
		this.author = author;
	}
	public String getName(){
		return name;
	}
	public int getPage(){
		return page;
	}
	public String getAuthor(){
		return author;
	}
	public String toString(){
		return name+", "+page+"p, "+author;
	}
}
class Magazine extends Book{
	private int date;
	public Magazine(String name, int page, String author, int date){
		super(name, page, author);
		this.date = date;
	}
	public Magazine(){
	}
	public void setDate(int date){
		this.date = date;
	}
	public int getDate(){
		return date;
	}
	public String toString(){
		return name+", "+page+"p, "+author+", 발매일:"+date;
	}
	public void info(){
		System.out.println(toString());
	}
}
class BookTest
{
	public static void main(String[] args) 
	{
		Book m1 = new Book("호빗", 300, "톨킨");
		Magazine m2 = new Magazine("반지의 제왕", 543, "톨킨", 1997);
		System.out.println(m1.toString());
		m2.info();
	}
}
