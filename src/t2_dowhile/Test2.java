package t2_dowhile;


/*
  do {
  	수행할 내용....
  } while(조건식);
  
  */
public class Test2 {
	public static void main(String[] args) {
		int i = 10;
		
		do {
			i++;
			System.out.println(i);
		}while(i < 10);//답이이상하게나옴
	}
}
