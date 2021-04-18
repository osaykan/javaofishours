package day7;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen ilk sayiyi giriniz");
		int num1=scan.nextInt();
		System.out.println("Lütfen ikinci sayiyi giriniz");
		int num2=scan.nextInt();
		karsilastirma(num1,num2);

	}

	public static void karsilastirma(int num1,int num2){
		if(num1<=num2){
			System.out.println(num2+" büyük sayidir");
			
		}else{
			System.out.println(num1+" kücük sayidir");
		}
	}
}
