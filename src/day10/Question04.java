package day10;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// Kullanici 0 sayisini girene kadar girilen sayilari toplayan java kodu
		
		Scanner scan =new Scanner(System.in);
	
		
		int num=0;
		int toplam=0;

		do {
			System.out.println("Tekrar sayi giriniz: ");
			 num=scan.nextInt();
			toplam+=num;
			
		}while(num!=0);
		
		System.out.println("Genel toplam : "+ toplam);
		
	}

}
