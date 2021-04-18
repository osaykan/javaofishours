package javaofficehours01;

import java.util.Scanner;

public class Day1c {

	public static void main(String[] args) {
		// Kullanicidan bes basamakli tam sayi alalim ve bu sayinin bastan iki ve sondan iki rakamlarin
		//basamak degeri ile toplama sonucunu yazdiralim  12345    12000+45
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Bes basamakli bir sayi giriniz");
		
		int num = sc.nextInt();
		 int ilkIki= (num/1000)*1000;
		 int sonIki= num%100;
		  int toplam= ilkIki+sonIki;
		  System.out.println("Toplam: "+toplam);
		
		  sc.close();

	}

}
