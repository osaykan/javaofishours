package javaofficehours02;

import java.util.Scanner;

public class Day2Moduls {

	public static void main(String[] args) {
		// Kullanicidan 5 basamakli pozitif tamsayi alalim ve her rakamini yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen 5 basamakli pozitif bir tamsayi giriniz: ");
       int num = scan.nextInt();
       
       
       
//       while(num>0){
//    	   int sum=0;
//    	   sum=sum+num%10;
//    	   num/=10;
//    	   System.out.println(sum);
//    	   
//       }
//       
       
       //Hoca c�z�m�
       int onbinler = num/10000;
       System.out.println("onbinler: "+onbinler);
       
       int binler = (num/1000)%10;
       System.out.println("binler: "+binler);
       
       int y�zler = (num/100)%10;
       System.out.println("y�zler: "+y�zler);
       
       int onlar = (num/10)%10;
       System.out.println("onlar: "+onlar);
       
       int birler = num%10;
       System.out.println("birler: "+birler);
       
       
       
       
       
       
       
       
       
	}

}
