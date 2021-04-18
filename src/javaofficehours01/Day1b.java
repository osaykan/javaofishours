package javaofficehours01;

import java.util.Scanner;

public class Day1b {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alalim ve bu sayilarin dört islem sonucunu ekrana yazdiralim
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki sayi gereiniz");
		
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		double toplama=num1+num2;
		
		System.out.println("Toplama: "+ toplama);
scan.close();
	}

}
