package com.nya.akillicihaz.app;

public class Eyleyici {
	private static boolean sogutucuDurumu =false;
	
	public static void acKapa() {
		if(sogutucuDurumu) {
			sogutucuDurumu = !sogutucuDurumu;
			System.out.println("Soğutucu Kapatıldı");
		}
		else {
			sogutucuDurumu = !sogutucuDurumu;
			System.out.println("Soğutucu Açıldı");
		}
	}
	public static String durumToString() {
		if(sogutucuDurumu) 
			return "Açık";
		else
			return "kapalı";
	}
	public static boolean isSogutucuDurumu() {
		return sogutucuDurumu;
	}
	public static void setSogutucuDurumu(boolean sogutucuDurumu) {
		Eyleyici.sogutucuDurumu = sogutucuDurumu;
	}
}
