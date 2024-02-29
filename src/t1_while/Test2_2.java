package t1_while;

import java.util.Scanner;
//이해 중간 완료@
//반복문 탈출 방법
public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0, su, breaksu;
		
		while(true) {		
			System.out.print("1부터 출력하고싶은 수를 입력하세요? ");
			su = sc.nextInt();
			System.out.print("탈출할 수를 입력하세요? ");
			breaksu = sc.nextInt();
		
			if(su >= breaksu) break;//su가 break보다 크면 탈출 / 작으면 다시물어봄
			else System.out.println("첫번째수는 두번째수보다 더 큰수를 입력하셔야합니다.\n");
		}
		
		while(i < su) {
			i++;
			System.out.println(i);
			
			if(i == breaksu) break;
		}
		
		sc.close();
	}
}
//무조건 마지막은 중괄호 2개여야한다.