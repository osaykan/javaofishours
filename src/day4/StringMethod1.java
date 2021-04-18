package day4;

import java.util.Scanner;

public class StringMethod1 {

	public static void main(String[] args) {
		//IndexOf Characterin yerini belirler.
/*		//istanbul kelimesindeki u nun indexi nedir
		String str = "istanbul";
		System.out.println(str.indexOf('u'));
		
		
		//lastndexOf
		String str1 = "Karakartal";
		System.out.println(str1.lastIndexOf('a'));

		//length()
		System.out.println(str1.length());
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str3 = scan.nextLine();
		
	System.out.println(str3.charAt(str3.length()-1));
	//contains()
	System.out.println(str3.contains("a"));// true veya false
*/
	//isEmpty()
	
	String se ="";
	System.out.println(se.isEmpty());
	
	//trim() bas ve sondaki bosluklari siler
	String str3 =" ankara ";
	System.out.println(str3.trim());
		
	
	//startsWith()
	String str4 ="ali gelmis";
	System.out.println(str4.startsWith("a"));//true
	
	//substring
	String str5 = "istanbullular";
	System.out.println(str5.substring(4));//nbullular
	System.out.println(str5.substring(4, 7));  //[4,7)
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir kelime giriniz");
	String str6 = scan.nextLine();
	
	char ilk =str6.charAt(0);
	char son=str6.charAt(str6.length()-1);
	System.out.println(son+str6.substring(1,str6.length()-1)+ilk);
	
	
	
	
	
	
	}

}
