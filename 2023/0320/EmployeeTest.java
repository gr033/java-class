class Employee
{
	private String name;
	private String num;
	private int mon;

	public void setName(String na){
		name = na;}
	public void setNum(String n){
		num = n;}
	public void setMon(int m){
		mon = m;}
	public String getName(){
		return name;}
	public int getNum(){
		return num;}
	public int getMon(){
		return mon;}
}
class EmployeeTest
{
	public static void main(String[] args) 
	{
		Employee em = new Employee();
		em.setName("홍길동");
		em.setNum("010-0000-0000");
		em.setMon(6000);
		System.out.println("이름 : "+em.getName());
		System.out.println("전화 : "+em.getNum());
		System.out.println("연봉 : "+em.getMon());
	}
}
