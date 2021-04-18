package day10;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// Kullanicidan 30.01.2000 formatinda tarih alacagiz ve bu tarihi yaziya
		// cevirecegiz.
		// otuzocakikibin
		/*
		 * "ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos",
		 * "eylul", "ekim", "kasim", "aralik"}; "bir", "iki", "uc", "dort", "bes",
		 * "alti", "yedi", "sekiz", "dokuz"}; "on", "yirmi", "otuz", "kirk", "elli",
		 * "altmis", "yetmis", "seksen", "doksan"}; "yuz", "ikiyuz", "ucyuz", "dortyuz",
		 * "besyuz", "altiyuz", "yediyuz", "sekizyuz", "dokuzyuz"}; "bin", "ikibin",
		 * "ucbin", "dortbin", "besbin", "altibin", "yedibin", "sekizbin", "dokuzbin"};
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("01.01.200 formatinda tarih yaziniz");

		String tarih = scan.nextLine();

		// 30.01.2000
		int on = new Integer(tarih.substring(0, 1));
		int bir = new Integer(tarih.substring(1, 2));
		int ay = new Integer(tarih.substring(3, 5));
		int yilbinler = new Integer(tarih.substring(6, 7));
		int yily�zler = new Integer(tarih.substring(7, 8));
		int yilonlar = new Integer(tarih.substring(8, 9));
		int yilbirler = new Integer(tarih.substring(9, 10));

		String[] aylar = { "", "ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos", "eylul",
				"ekim", "kasim", "aralik" };

		String[] birler = { "", "bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz" };
		String[] onlar = { "", "on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan" };
		String[] y�zler = { "", "yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz", "sekizyuz",
				"dokuzyuz" };
		String[] binler = { "", "bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin", "sekizbin",
				"dokuzbin" };

		System.out.println(onlar[on] + birler[bir] + " " + aylar[ay] + " " + binler[yilbinler] + y�zler[yily�zler]
				+ onlar[yilonlar] + birler[yilbirler]);

	}

}
