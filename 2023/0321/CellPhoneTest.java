class CellPhone
{
	private String model;
	private String company;
	private String color;
	private boolean power;
	private boolean camera;

	public CellPhone(){
	}
	public CellPhone(String model, String company, String color, boolean power, boolean camera){
			this.model = model;
			this.company = company;
			this.color = color;
			this.power = power;
			this.camera = camera;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return this.model;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public String getCompany(){
		return this.company;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setPower(boolean power){
		this.power = power;
	}
	public boolean getPower(){
		return this.power;
	}
	public void setCamera(boolean camera){
		this.camera = camera;
	}
	public boolean getCamera(){
		return this.camera;
	}
	public void Power(){
		power = !power;
	}
	public void info(){
		System.out.println("모델명 : "+model);
		System.out.println("제조사 : "+company);
		System.out.println("색상 : "+color);
		System.out.println("전원 : "+power);
		System.out.println("카메라 유무 : "+camera);
	}

}
class CellPhoneTest
{
	public static void main(String[] args) 
	{
		CellPhone p1 = new CellPhone();
		CellPhone p2 = new CellPhone("S23","SAMSUNG","BLACK",true,true);
		p2.Power();
		p1.info();
		System.out.println();
		p2.info();
	}
}
