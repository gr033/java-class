import java.util.Scanner;
class Calcu02
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, add, sub, multi, div;

		System.out.println("Input first number : ");
		num1 = sc.nextInt();
		System.out.println("Input second number : ");
		num2 = sc.nextInt();
		add = num1+num2;
		sub = num1-num2;
		multi = num1*num2;
		div = num1/num2;
		

		System.out.println(num1+"+"+num2+"="+add);
		System.out.println(num1+"-"+num2+"="+sub);
		System.out.println(num1+"*"+num2+"="+multi);		
		System.out.println(num1+"/"+num2+"="+div);
	}
}