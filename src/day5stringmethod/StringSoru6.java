package day5stringmethod;

import java.util.Scanner;

public class StringSoru6 {

	public static void main(String[] args) {
		//palindrom sayi   12321 veya madam gibi terside esit
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String str = scan.nextLine();
		
		String str1 ="";
		int length=str.length();
		while(length>0){
			str1+=str.charAt(length-1);
			length--;
		}

		if(str.equals(str1)){
			System.out.println("Bu String palindrom sayidir");
		}else{
			System.out.println("Bu sayi palindrom sayi degildir");
		}
		
	}

}
