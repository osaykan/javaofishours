package day5stringmethod;

import java.util.Scanner;

public class StringSoru3 {

	public static void main(String[] args) {
//Kullanicidan alinan String k�mesi icerisinde aranan Stringi bulan kodu yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir c�mle giriniz");
		String str = scan.nextLine();
		System.out.println("Bulunacak kelimeyi giriniz");
		String bul = scan.nextLine();
		System.out.println(str.contains(bul));

	}

}
