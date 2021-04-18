package day03;

import java.util.Scanner;

public class IfOrnek {

	public static void main(String[] args) {
		// Kullanicidan yasini ve kilosunu alalim
		//18 yasindan kücükse kan bagisi yapamasin
		//18 den büyük ve 50 kg dan zayifsa kan veremesin
		//18 den büyük ve 50kg dan fazlaysa kan bagisi yapabilsin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println("Kilonuzu giriniz");
		int kilo = scan.nextInt();
		
		if(yas<18 || (yas>=18 && kilo<50)){
			System.out.println("Kan bagisi yapamazsiniz");
		}else{
          System.out.println("Kan bagisi yapabilirsiniz");			
		}

		String result = yas<18 ? "Kan bagisi yapamazsiniz":kilo<50?"Kan bagisi yapamazsiniz":"Kan bagisi yapabilirsiniz";
		System.out.println(result);
		
		
	}

}
