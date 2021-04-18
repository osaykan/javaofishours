package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru04BinaryToplama {

	public static void main(String[] args) {
		// Kullanicidan 2 binary sayi alalim ve
		// 2 binary sayiyi toplayan kabu yazalim
		// 111
		// 111
		// +-----
		// 1110
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 2 tane binary sayi giriniz.");
		long binary1 = sc.nextLong();
		long binary2 = sc.nextLong();
		int elde = 0;
		List<Integer> sum = new ArrayList<>();

		while (binary1 != 0 || binary2 != 0) {
			sum.add((int) ((binary1 % 10 + binary2 % 10 + elde) % 2));
			elde = (int) ((binary1 % 10 + binary2 % 10 + elde) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if (elde != 0) {
			sum.add(elde);
		}
		System.out.println(sum);
//        	for(int i = sum.size()-1;i>=0;i--){
//        	
//        		System.out.println(sum.get(i));
//                        }
	}
}
