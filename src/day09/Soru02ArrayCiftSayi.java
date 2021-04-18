package day09;

import java.util.Scanner;

public class Soru02ArrayCiftSayi {

	public static void main(String[] args) {
		// Kullanicidan 5 adet tam sayi girmesini isteyelim ve bu sayilari bir arrayde
		// toplayalim,
		// icindeki cift sayilarin sayisini yazdiralim
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 5 tane tam sayi giriniz");
		int[] nums = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Girilen sayilardaki cift sayi adedi: " + count);
	}
	
}
