package day03;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		// //Kullanicidan 2 poz tam sayi alacagiz ebob unu bulan bir kod
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki tane pozitif tam sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
	
		int obeb=0;
		for (int i = 1; i <=num1 && i<=num2 ; i++) {
			
			if(num1%i==0 && num2%i==0){
				obeb=i;
			}
			
		}System.out.println(num1+" ve "+num2+" ortak böleni:  "+obeb);

	}

}
