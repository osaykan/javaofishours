package day6stringvemethod;

import java.util.Scanner;

public class StringKarakterDSirasi {

	public static void main(String[] args) {
		// Grilen String değer içinde istenen indexteki  karakteri bulan
				//Java kodunu yazınız.
		
		
	   		Scanner scan=new Scanner(System.in);
			String str = scan.nextLine();
			int ch = scan.nextInt();
			
			if(ch>=0&&ch<str.length()) {
				
				System.out.println(ch+". pozisyondaki karakter : "+str.charAt(ch));
				
			}

	}

}
