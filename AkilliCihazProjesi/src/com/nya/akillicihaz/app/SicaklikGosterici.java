package com.nya.akillicihaz.app;

public class SicaklikGosterici implements IObserver {

	@Override
	public void update(int sicaklik) {
		System.out.println("Şu anki sıcaklık "+sicaklik+"°C");
		
	}
}
