package day5stringmethod;

import java.util.Scanner;

public class StringSoru5 {

	public static void main(String[] args) {
		//Kullanicinin girdigi Stringi büyük harfe cevir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String str = scan.nextLine().toUpperCase();
		System.out.println(str);

	}

}
