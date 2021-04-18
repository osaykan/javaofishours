package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * "Adana", "Adiyaman", "Afyon", "Agri", "Amasya", "Ankara", "Antalya",
		 * "Artvin", "Aydin", "Balikesir", "Bilecik", "Bingöl", "Bitlis", "Bolu",
		 * "Burdur", "Bursa", "Canakkale", "Cankiri", "Corum", "Denizli", "Diyarbakir",
		 * "Edirne", "Elazig", "Erzincan", "Erzurum", "Eskisehir", "Gaziantep",
		 * "Giresun", "Gümüshane", "Hakkari", "Hatay", "Isparta", "Icel (Mersin)",
		 * "Istanbul", "Izmir", "Kars", "Kastamonu", "Kayseri", "Kirklareli",
		 * "Kirsehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "K.maras",
		 * "Mardin", "Mugla", "Mus", "Nevsehir", "Nigde", "Ordu", "Rize", "Sakarya",
		 * "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdag", "Tokat", "Trabzon",
		 * "Tunceli", "Sanliurfa", "Usak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		 * "Bayburt", "Karaman", "Kirikkale", "Batman", "Sirnak", "Bartin", "Ardahan",
		 * "Igdir", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
		 */
		Scanner sc = new Scanner(System.in);
		int plaka = sc.nextInt();
		String Sehirler[] = { "", "Adana", "Adiyaman", "Afyon", "Agri", "Amasya", "Ankara", "Antalya", "Artvin",
				"Aydin", "Balikesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Canakkale", "Cankiri",
				"Corum", "Denizli", "Diyarbakir", "Edirne", "Elazig", "Erzincan", "Erzurum", "Eskisehir", "Gaziantep",
				"Giresun", "Gümüshane", "Hakkari", "Hatay", "Isparta", "Icel (Mersin)", "Istanbul", "Izmir", "Kars",
				"Kastamonu", "Kayseri", "Kirklareli", "Kırsehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
				"K.maras", "Mardin", "Mugla", "Mus", "Nevsehir", "Nigde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt",
				"Sinop", "Sivas", "Tekirdag", "Tokat", "Trabzon", "Tunceli", "Sanliurfa", "Usak", "Van", "Yozgat",
				"Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kirikkale", "Batman", "Sirnak", "Bartin", "Ardahan",
				"Igdir", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" };

		// System.out.println("Girilen Plaka numarası " + Sehirler[plaka] + " aittir");
		int Plaka = Byte.valueOf(JOptionPane.showInputDialog("Lütfen bir plaka numarasi giriniz."));
		JOptionPane.showMessageDialog(null, Sehirler[Plaka]);
	}
	
}

