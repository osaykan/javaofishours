package kullaniciolusturma;

public interface IKullanici {

	void kullaniciKaydet(Kullanici kullanici);

	void kullaniciSil(int id);

	void kullaniciGüncelleme(int id, Kullanici kullanici);

	void kullaniciGörüntüleme();

}
