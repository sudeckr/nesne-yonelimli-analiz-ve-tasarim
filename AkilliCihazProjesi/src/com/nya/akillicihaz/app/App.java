package com.nya.akillicihaz.app;

import java.sql.SQLException;
import java.util.*;

public class App {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Akıllı Cihaz Arayüzüne Hoş Geldiniz Kullanıcı Adı Ve Şifrenizi Giriniz");
		System.out.print("Kullanici Adi: ");
		String kullaniciAdi = scanner.nextLine();
		System.out.print("Sifre: ");
		String sifre = scanner.nextLine();
		
		int secim = 0;

		if (KullaniciDogrulama.kullaniciDogrula(kullaniciAdi, sifre)) {
			System.out.println("Giriş Başarılı..");
			do {
				System.out.println("--------------------------------------");
				System.out.println("Şu Anki Soğutucu Durumu: " + Eyleyici.durumToString());
				System.out.println("Yapmak istediğiniz işlemi seçiniz..");
				System.out.println("1-Anlık Sıcaklık Göster");
				if (Eyleyici.isSogutucuDurumu()) {
					System.out.println("2-Soğutucuyu Kapat");
				} else {
					System.out.println("2-Soğutucuyu Aç");
				}
				System.out.println("3-Çıkış Yap");
				secim = scanner.nextInt();

				switch (secim) {
				case 1:
					final SicaklikArabirimi sicaklikArabirimi = new SicaklikArabirimi();
					final SicaklikGosterici sicaklikGosterici = new SicaklikGosterici();
					sicaklikArabirimi.registerObserver(sicaklikGosterici);
					sicaklikArabirimi.sicaklikOlc();
					break;
				case 2:
					Eyleyici.acKapa();
					break;
				case 3:
					System.out.println("Çıkış Yap..");
					break;
				default:
					System.out.println("Geçersiz Seçim..");
				}
			} while (secim != 3);
		} else {
			System.out.println("Geçersiz Kullancı Adı veya şifre..");
		}

		scanner.close();
	}

}
