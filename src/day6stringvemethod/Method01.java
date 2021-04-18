package day6stringvemethod;

public class Method01 {

	public static void main(String[] args) {
		// Saat ve dakika girildiginde bize saniye return eden methodu yazalim.
		
		 System.out.println("Saniye Sonucu: "+saniyeDonusturucu(3, 20)); 

	}
	public static int saniyeDonusturucu(int hours, int minutes) {
		
		int seconds = hours*3600 + minutes*60;
		
		return seconds;
	}

}
