//사용자에게 이름, 생월, 생일을 입력받아 별자리를 판별하여 출력하는 프로그램 작성.
//예) 이름을 입력하세요. 생월을 입력하세요. 생일을 입력하세요.
//000님의 별자리는 000자리 입니다.	
import java.util.Scanner;
class StarBirth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month, day;
		String name, star = "";
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("생월을 입력하세요.");	
		month = sc.nextInt();
		if(month >12 || month <1){System.out.println("잘못된 입력입니다.");return;}
		int lastDay = 31;
		if (month ==2){lastDay = 28;}
		else if (month ==4 || month ==6 ||month ==9||month==11){lastDay = 30;}
		System.out.println("생일을 입력하세요.");	
		day = sc.nextInt();
		if(day<1 || day>lastDay){System.out.println("잘못된 입력입니다.");return;}
		

		switch (month){
				case 1:if(day<=19){star = "염소자리";} else{star = "물병자리";} break;
				case 2:if(day<=18){star = "물병자리";} else{star = "물고기자리";} break;
				case 3:if(day<=20){star = "물고기자리";} else{star = "양자리";} break;
				case 4:if(day<=19){star = "양자리";} else{star = "황소자리";} break;
				case 5:if(day<=20){star = "황소자리";} else{star = "쌍둥이자리";} break;
				case 6:if(day<=21){star = "쌍둥이자리";} else{star = "게자리";} break;
				case 7:if(day<=22){star = "게자리";} else{star = "사자자리";} break;
				case 8:if(day<=22){star = "사자자리";} else{star = "처녀자리";} break;
				case 9:if(day<=23){star = "처녀자리";} else{star = "천칭자리";} break;
				case 10:if(day<=22){star = "천칭자리";} else{star = "전갈자리";} break;
				case 11:if(day<=22){star = "전갈자리";} else{star = "사수자리";} break;
				case 12:if(day<=24){star = "사수자리";} else{star = "염소자리";} break;
		}			
		System.out.println(name+"님의 별자리는 "+star+"입니다.");
	}
}
