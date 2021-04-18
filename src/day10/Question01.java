package day10;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// Klavyeden girilen bir cümlede belirttigimiz bir
		// harfin tekrar sayisini hesaplayalim.

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle = input.nextLine();

		System.out.println("Tekrari bulunacak harf giriniz");
		String harf = input.next();
		int harfSayisi = 0;

		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.substring(i, i + 1).equals(harf)) {
				harfSayisi++;
			}
		}

		System.out.println(harf + " harfi " + harfSayisi + " defa tekrar edilmistir.");
	
	}
}

