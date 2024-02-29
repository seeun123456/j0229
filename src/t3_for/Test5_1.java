package t3_for;
//중첩 for문 안쪽3번 안쪽4번 * 결과는12번
public class Test5_1 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt);
			}
		}
	}
}
