package t4_exam;

/*
 	*****
 	****
 	***
 	**
 	*
 */
public class star6 {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {//i 초기값이1이라 6-i 하면 처음별 갯수는 5개
				
				System.out.print("*");
			}
		
			System.out.println();
		}
		
	}
}