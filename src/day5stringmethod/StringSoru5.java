package day5stringmethod;

import java.util.Scanner;

public class StringSoru5 {

	public static void main(String[] args) {
		//Kullanicinin girdigi Stringi b�y�k harfe cevir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir c�mle giriniz");
		String str = scan.nextLine().toUpperCase();
		System.out.println(str);

	}

}
