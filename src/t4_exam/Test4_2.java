package t4_exam;


import java.util.Scanner;

//1개의 주사위를 던졌을때 나오는 숫자 맞추기 게임
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, rand;//나는 su를 와일문 밖에서도 사용할거야 라고 선언(그래야 안에서도 사용하고 밖에서도 사용가능)
		
		while(true) {
			System.out.print("출력될 주사위 눈금을 입력하세요");
			su = sc.nextInt();
		/*
			if(su > 6 || su < 1) {
				System.out.println("1~6까지의 수를 입력하세요");
			}
			else break;*/
			if(su >= 1 && su <= 6)break;
			System.out.println("1~6까지의 수를 입력하세요");
		}
		
		rand = (int)(Math.random()*6) + 1;
		
		if(su == rand) System.out.println("정답입니다!.");	
		else System.out.println("틀렸습니다. 출력된 주사위의 눈금은 "+rand+"입니다");
		
		sc.close();
	}
}
