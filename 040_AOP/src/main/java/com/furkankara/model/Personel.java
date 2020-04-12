package com.furkankara.model;

public class Personel {

	private String adi;
	private String soyadi;
	private int tecrube;
	
	public void adiSoyadiKontrolEt(){
		System.out.println("-----adiSoyadKontorlet()-------\n\n");
		
		if(getAdi().length() < 2  || getSoyadi().length() < 2) {
			throw new IllegalArgumentException();
		}
	
	}
	
	public void selamlama(String mesaj) {
		System.out.println("--------selamlama(String mesaj)--------");
		System.out.println("Gelen Mesaj :"+mesaj);
		System.out.println("\n\n");
	
	}
	
	public void personelBilgiVer() {
		System.out.println("------personelBilgiVer()----------------");
		System.out.println("Adi soyadi : " + getAdi() + " " + getSoyadi() +
				"\nTecrube :"+getTecrube()+ "YIL\n\n");
	}
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getTecrube() {
		return tecrube;
	}
	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}
	
}
