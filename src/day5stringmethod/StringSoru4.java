package day5stringmethod;

import java.util.Scanner;

public class StringSoru4 {

	public static void main(String[] args) {
		//Kullanicidan alinan Stringin son characterini silip ekrana yazdiran kod
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String str = scan.nextLine();
		
		System.out.println(str.substring(0, str.length()-1));
		
scan.close();
	}

}
