class Plane
{
	private String airline;
	private String model;
	private int max;
	public static int planes;
	public void setMax(int max){
		this.max = max;
		planes++;
	}
	public void setAirline(String airline){
		this.airline = airline;
		planes++;
	}
	public void setModel(String model){
		this.model = model;
		planes++;
	}
	public int getMax(int max){
		return max;
	}
	public String getAirline(){
		return airline;
	}
	public String getModel(){
		return model;
	}
	public Plane(String airline, String model, int max){
		this.airline = airline;
		this.model = model;
		this.max = max;
		planes++;
	}
	public Plane(){
		planes++;
	}
	public Plane(String airline){
		this.airline = airline;
		this.model = null;
		this.max = 0;
		planes++;
	}
	public Plane(String airline, String model){
		this.airline = airline;
		this.model = model;
		this.max = 0;
		planes++;
	}
	public static int getPlanes(){
		return planes;
	}
	
	public void info(){
		System.out.println("항공사 : "+airline+"\n모델명 : "+model+"\n최대 인원수 : " +max);
	}

}
class PlaneTest 
{
	public static void main(String[] args) 
	{
		System.out.println("비행기 대수 : " + Plane.planes);
		System.out.println();
		Plane p1 = new Plane("제주항공", "A710", 500);
		Plane p2 = new Plane();
		Plane p3 = new Plane("티웨이항공");
		Plane p4 = new Plane("에어서울", "A110");
		p1.info();
		System.out.println();
		p2.info();
		System.out.println();
		p3.info();
		System.out.println();
		p4.info();
		System.out.println();
		System.out.println("비행기 대수 : " + Plane.planes);
		System.out.println(Plane.getPlanes());
	}
}
