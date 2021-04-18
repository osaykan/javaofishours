package kullaniciolusturma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		VBKullanici vbKullanici = new VBKullanici();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println(
					"Hangi Islemi gerceklestirmek isterseniz?\n1-)Kullanici Ekle\n2-)Kullanici Sil\n3-)Kullanici Güncelle\n4-)Tüm Kullanicilar\n5-)Cikis");
			int islem = input.nextInt();
			input.nextLine();
			if (islem == 1) {
				System.out.println("Kullanici Adi Giriniz: ");
				String kulAdi = input.next();
				System.out.println("Kullanici Parola Giriniz: ");
				String parola = input.next();

				input.nextLine();

				System.out.println("Kullanici Isim Giriniz: ");
				String isim = input.nextLine();
				System.out.println("Kullanici Soyadi Giriniz: ");
				String soyisim = input.nextLine();
				System.out.println("Kullanici Email Giriniz: ");
				String mail = input.next();

				Kullanici kullanici = new Kullanici(kulAdi, parola, isim, soyisim, mail);
				vbKullanici.kullaniciKaydet(kullanici);

			} else if (islem == 2) {
				System.out.println("Silmek istediginiz kullanici index ini giriniz: ");
				int id = input.nextInt();
				vbKullanici.kullaniciSil(id);

			} else if (islem == 3) {

				System.out.println("Güncellemek istediginiz Kullanici index ini giriniz: ");
				int id = input.nextInt();

				input.nextLine();

				System.out.println("Kullanici Adi Giriniz: ");
				String kulAdi = input.next();
				System.out.println("Kullanici Parola Giriniz: ");
				String parola = input.next();
				System.out.println("Kullanici Isim Giriniz: ");
				String isim = input.nextLine();

				input.nextLine();

				System.out.println("Kullanici Soyadi Giriniz: ");
				String soyisim = input.nextLine();
				System.out.println("Kullanici Email Giriniz: ");
				String mail = input.next();

				Kullanici kullanici = new Kullanici(kulAdi, parola, isim, soyisim, mail);

				vbKullanici.kullaniciGüncelleme(id, kullanici);

			} else if (islem == 4) {
				vbKullanici.kullaniciGörüntüleme();

			} else if (islem == 5) {
				System.out.println("Program Sonlandirildi.");
				break;
			}
		}

	}

}
