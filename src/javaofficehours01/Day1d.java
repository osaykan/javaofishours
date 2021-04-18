package javaofficehours01;

public class Day1d {

	public static void main(String[] args) {
		// 1 den 100 e kadar olan sayilarin 3'e veya 5'e veya 15'e bölünen sayilari yazdiralim
		
		for(int i=1;i<101;i++){
			if(i%3==0||i%5==0||i%15==0){
				System.out.print(i+" ");
			}
			
			
			
		}

	}

}
