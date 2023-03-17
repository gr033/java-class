import java.util.Scanner;
class CreditCard02
{
	public static void main(String[] args) 
	{
		double month[] = new double[12];
		double sum = 0, ave = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0;i<12;i++){
			System.out.println((i+1)+"월의 사용금액을 입력하세요");
			month[i] = sc.nextDouble();
			if (month[i]<0){
				System.out.println("양수값을 입력하세요.");
				return;
			}
			sum += month[i];
		}
		ave = sum/month.length;
		
		double max = month[0];
		double min = month[0];
		for (int i = 1;i<month.length;i++)
		{
			if (month[i]>max)
			{
				max = month[i];
			}
			if (month[i]<min)
			{
				min = month[i];
			}
		}
		System.out.println("전체 사용 금액 : "+sum);
		System.out.println("평균 사용 금액 : "+ave);
		System.out.print("가장 지출이 많았던 월 : ");
		for (int i = 0 ; i<month.length ; i++ )
		{
			if (max ==month[i])
			{
				System.out.print((i+1)+" ");
			}
		}
		System.out.println();
		System.out.print("가장 지출이 적었던 월");
		for (int i = 0;i<month.length;i++)
		{
			if (min == month[i])
			{
				System.out.print((i+1)+" ");
			}
		}
		
	}
}

/*
double max = month[0], min = month[0];
		int max_month=1, min_month=1;
		for (int i=0;i<12;i++){
			if (month[i]>max){
				max = month[i];
				max_month=i;
			}
			if (month[i]<min){
				min = month[i];
				min_month=i;
			}
		}
		System.out.println("전체 사용 금액 : "+sum);
		System.out.println("월별 평균 사용 금액 : "+ave);
		System.out.println("가장 지출 많았던 월 : "+max_month+"월");
		System.out.println("가장 지출 적었던 월 : "+min_month+"월");
*/