package day7;

public class Method03 {

	public static void main(String[] args) {
		// Grilen sayinin tersini ekrana yazdirin
    System.out.println( sayininTersi(7896));
		
	}
	public static int sayininTersi(int n){
		int sonuc=0;
		while(n>0){
			
			
			sonuc=sonuc*10+n%10;
			//int sayi=n%10;
			n/=10;
			//sonuc=sonuc*10+sayi;
			
		}
		return sonuc;
		
	}

}
