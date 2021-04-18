package day4;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		//Kullanicidan alinacak sayinin negatif pozitif yada notr olup olmadigini kontrol eden bir 
		//ternary yapalim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		double num=scan.nextDouble();
		String result = num>0? "Pozitif":num<0? "Negatif": "Notr";
		System.out.println(result);

	}

}
