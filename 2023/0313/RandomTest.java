//난수만들기 
//임의의 수 (무작위 수, 아무 수, 제비뽑기)를 난수라고 함
import java.util.Random;
class RandomTest 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int a = r.nextInt(10);
		System.out.println(a);
	}
}
