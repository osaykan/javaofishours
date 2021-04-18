package day10;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alalim 1. sayi taban olsun. 2. sayi üssü olsun
		// 1. sayinin üsünü bulalim

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen taban sayisini giriniz");
		int taban = sc.nextInt();

		System.out.println("Lütfen üss sayisini giriniz");
		int kuvvet = sc.nextInt();

		int sonuc = 1;
		/*
		 * while (kuvvet !=0){ ​ sonuc *=taban; kuvvet--; ​ }
		 * System.out.println("Cevap: " + sonuc); ​
		 */
		/*
		 * for (;kuvvet!=0;kuvvet--){ sonuc *=taban; } System.out.println("Cevap: " +
		 * sonuc); ​
		 */
		double result = Math.pow(taban, kuvvet);

		System.out.println(result);
	}
}
