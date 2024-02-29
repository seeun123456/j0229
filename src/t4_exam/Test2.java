package t4_exam;

public class Test2 {
	public static void main(String[] args) {
		int lotto;
		String str = "";
		for(int i=1; i<=6; i++) {
			lotto = (int)(Math.random()*45) + 1;//1에서 45까지에 정수형 난수가 나온다
			str += lotto + " / "; //str= str + lotto; / str = str + <누적
			
		}
		System.out.println("금주의 로또 번호는? " + str);
	}
}
