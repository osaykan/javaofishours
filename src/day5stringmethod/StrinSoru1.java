package day5stringmethod;

import java.util.List;
import java.util.Scanner;

public class StrinSoru1 {

	public static void main(String[] args) {
		// 1.Kullanicidan Girilen String değeri tersten yazan Java kodunu yazınız.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String str = scan.nextLine();
//		String yeni="";
//		for (int i = str.length()-1; i >= 0; i--) {
//			yeni+=str.charAt(i);
//			
//		}
//	System.out.println(yeni);
	
    StringBuilder  sbl = new StringBuilder(str);
    System.out.println(sbl.reverse());
 }

}
