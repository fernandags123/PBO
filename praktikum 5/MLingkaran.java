/**
* File		    : MLingkaran.java 26-03-2023
* Nama / NIM	: Fernanda Galih Saputra / 240601211401176
* Deskripsi	    : Implementasi untuk menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jari-jari lingkaran : ");
		double jarijari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jarijari);
		System.out.println("Luas lingkaran dengan jari-jari "+jarijari+" satuan adalah "+l.hitungLuas());
	}
}
