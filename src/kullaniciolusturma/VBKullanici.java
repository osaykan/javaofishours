package kullaniciolusturma;

import java.util.ArrayList;

public class VBKullanici implements IKullanici {

	ArrayList<Kullanici> kullanicilar = new ArrayList<Kullanici>();

	@Override
	public void kullaniciKaydet(Kullanici kullanici) {
		kullanicilar.add(kullanici);

	}

	@Override
	public void kullaniciSil(int id) {
		kullanicilar.remove(id);

	}

	@Override
	public void kullaniciGüncelleme(int id, Kullanici kullanici) {
		kullanicilar.set(id, kullanici);

	}

	@Override
	public void kullaniciGörüntüleme() {

		if (kullanicilar.isEmpty()) {
			System.out.println("Su an listede kayitli kullanici bulunmamaktadir");
		}

		for (Kullanici kul : kullanicilar) {
			System.out.println("Kullanici Adi: " + kul.getKullaniciAdi() + "\nParola: " + kul.getParola() + "\nIsim: "
					+ kul.getIsim() + "\nSoyisim: " + kul.getSoyisim() + "\nMail Adresi: " + kul.getMail()
					+ "\n_________________");

		}

	}

}
