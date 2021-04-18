package day09;

import java.util.Arrays;

public class Soru03ArrayReverse {

	// Bir arrayi tersine ceviren java kodunu yazalim
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(reverse(arr)));
	}
	
	public static int[] reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}
}

