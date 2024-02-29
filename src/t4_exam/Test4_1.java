package t4_exam;


import java.util.Scanner;

//1개의 주사위를 던졌을때 나오는 숫자 맞추기 게임
public class Test4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력될 주사위 눈금을 입력하세요");
		int su = sc.nextInt();
		
		int rand = (int)(Math.random()*6) + 1;
		
		if(su == rand) System.out.println("정답입니다!.");	
		else System.out.println("틀렸습니다. 출력된 주사위의 눈금은 "+rand+"입니다");
		
		sc.close();
	}
}
