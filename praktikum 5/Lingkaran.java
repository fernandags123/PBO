/**
* File		    : Lingkaran.java 26-03-2023
* Nama / NIM	: Fernanda Galih Saputra / 24060121140176
* Deskripsi	    : Kelas implementasi IArea berupa cara untuk menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}
