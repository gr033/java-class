abstract class Employee
{
	protected String name;
	protected String num;
	protected int salary;
	public String void toString(){
		return "이름: "+name+", 사원번호: "+num+", 실수령액: "+salary;
	}
	public abstract void computeSalary();
	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getNum(){
		return num;
	}
	public void setNum(String num){
		this.num = num;
	}
	public void setName(String name){
		this.name = name;
	}
	public Employee(){
	}
	public Employee(String name, String num){
		this.name = name;
		this.num = num;
	}
}
class SalariedEmployee extends Employee{
	private int level;
	private int base;
	private int sudang;
	public SalariedEmployee(){
	}
	public SalariedEmployee(String name, String num, int level){
		super(name, num);
		this.level = level;
	}
	public void computeSalary(){
		switch (level)
		{
		case 1:base=2000000; sudang=200000; break;
		case 2:base=3000000; sudang=350000; break;
		case 3:base=5000000; sudang=500000; break;
		}
		salary = base + sudang;
	}
	public String toString(){
		return super.toString()+", 호봉: "+level+", 기본금: "+base+", 수당: "+sudang;
	}
}
class HourlyEmployee extends Employee{
	private int base;
	private int hour;
	public HourlyEmployee(){
	}
	public HourlyEmployee(String name, String num, int base, int hour){
		super(name, num);
		this.base = base;
		this.hour = hour;
	}
	
	public String toString(){
		return super.toString()+", 시간당 급여: "+base+", 작업시간: "+hour;
	}
}
class EmployeeTest04
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		System.out.println(e,toString());
	}
}
