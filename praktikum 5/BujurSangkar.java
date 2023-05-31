/**
* File		    : BujurSangkar.java 29-03-2023
* Nama / NIM	: Fernanda Galih Saputra / 24060121140176
* Deskripsi	    : Kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
	//apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar 
	//maka kelas BujurSangkar juga harus dideklarasikan sebagai kelas abstrak. 
	//Ini karena, kelas BujurSangkar akan mewarisi metode abstrak dari kelas induknya (BangunDatar) 
	//tetapi tidak memberikan implementasi untuk metode abstrak tersebut.
	public double hitungLuas(double sisi){
		luas = sisi*sisi;
		return luas;
	}
}
