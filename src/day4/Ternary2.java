package day4;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		//Kullanicidan bir harf alalim ve bunun b�y�k harf, 
		//k�c�k harf yada hatali giris olma durumunu kontrol edelim

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		String result = (harf>='a'&&harf<='z') ? "K�c�k harf": (harf>='A' && harf<='Z')?"B�y�k harf": "Hatali giris yaptiniz";
		System.out.println(result);
		
		
		
	}

}
