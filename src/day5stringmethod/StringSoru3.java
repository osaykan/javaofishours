package day5stringmethod;

import java.util.Scanner;

public class StringSoru3 {

	public static void main(String[] args) {
//Kullanicidan alinan String kümesi icerisinde aranan Stringi bulan kodu yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String str = scan.nextLine();
		System.out.println("Bulunacak kelimeyi giriniz");
		String bul = scan.nextLine();
		System.out.println(str.contains(bul));

	}

}
