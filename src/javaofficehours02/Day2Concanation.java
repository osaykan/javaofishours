package javaofficehours02;

import java.util.Scanner;

public class Day2Concanation {

	public static void main(String[] args) {
		// 5 + "Ali"
       //"Ali"+5+5
//		System.out.println(5+"Ali");
//		System.out.println("Ali"+(5+5));
//		System.out.println(5+5+"Ali"+4+3);
//		
//		int num = 4;
//		num=num+1;
//		num+=1;
//		num++;
//		System.out.println(num);
//		
//		int num1 =5;
//		num1=num1*2;
//		num1*=3;
//		System.out.println(num1);
//		
//		System.out.println(1==3);
//		System.out.println(2==2);
		
		//Kullanicidan 3 tane pozitif tam sayi alalim
		//Bu sayilarla ücgen olup olmayacagini kontrol edelim
		//Ücgen ise esitkenarmi
		//a+b>c>a-b
		//a+c>b>a-c
		//b+c>a>b-c
		Scanner scan = new Scanner(System.in);
		System.out.println("Üc kenar uzunlugunu giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a+b>c&&c>a-b)&&(a+c>b&&b>a-c)&& (b+c>a&&a>b-c)){              //Mutlak degerlerinede aslinda bakmaliyiz
			if(a==b||b==c||a==c){
				System.out.println("Ikizkenar Ücgen");
			}else if(a==b&&b==c){
				System.out.println("Eskenar ücgen");
			}else{
				System.out.println("Cesit kenar ücgen");
			}
		}else{
			System.out.println("Ücgen degil");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
