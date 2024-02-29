package t3_for;
//중첩 for문 안쪽3번 안쪽4번 * 결과는12번

public class Test7 {
	public static void main(String[] args) {
		int cnt = 0;
		// Lable(이름:)을 적어주면 해당 for문을 탈출시켜줄 수 있다.
		atom:for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = " + i + ", j =" + j);
				
				//앞의 문장을 6번 수행후 탈출시키고자 한다.
				if(cnt == 6)break atom;// atom블록을 탈출시킨다.
			}
			System.out.println();
		}
		System.out.println("작업끝");
	}
}
