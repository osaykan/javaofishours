package javaofficehours02;

import java.util.Scanner;

public class Day2For {

	public static void main(String[] args) {
		// for döngüsü ile
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		12345678910
		
		for(int i = 1; i<=10;i++){
			for(int j = 1;j<=i;j++)
				System.out.print(j);
				System.out.println("");
				
				
				
				//Kullanicidan 2 poz tam sayi alacagiz ebob unu bulan bir kod
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Iki tane pozitif tam sayi giriniz");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				
			
			
		}

	}

}
