package kullaniciolusturma;

public interface IKullanici {

	void kullaniciKaydet(Kullanici kullanici);

	void kullaniciSil(int id);

	void kullaniciG�ncelleme(int id, Kullanici kullanici);

	void kullaniciG�r�nt�leme();

}
