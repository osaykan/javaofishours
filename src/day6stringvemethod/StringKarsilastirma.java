package day6stringvemethod;

import java.util.Scanner;

public class StringKarsilastirma {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Lütfen iki kelime giriniz");
		    String str1 = input.nextLine();
		    String str2 = input.nextLine();
		    
		    System.out.println(str1.contentEquals(str2));
//		    if(str1.equals(str2)){
//		      System.out.println("true");
//		    }else{
//		      System.out.println("False");
//		    }
//		    

	}

}
