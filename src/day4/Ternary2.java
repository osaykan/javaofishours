package day4;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		//Kullanicidan bir harf alalim ve bunun büyük harf, 
		//kücük harf yada hatali giris olma durumunu kontrol edelim

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		String result = (harf>='a'&&harf<='z') ? "Kücük harf": (harf>='A' && harf<='Z')?"Büyük harf": "Hatali giris yaptiniz";
		System.out.println(result);
		
		
		
	}

}
