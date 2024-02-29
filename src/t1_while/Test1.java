package t1_while;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("안녕하세요...");
		System.out.println("안녕하세요...");
		System.out.println("안녕하세요...");
		System.out.println("안녕하세요...");
		System.out.println("안녕하세요...");
		
		System.out.println();
		/* 
		 while(조건식) {
		   조건식읭 내용이 참인동안 반복 수행한다.
		 */
		int cnt = 0;
		while(cnt < 5) {
			System.out.println("안녕하세요");
			cnt++; //이걸 안써주면 무한으로 나온다
		}
	}
}
