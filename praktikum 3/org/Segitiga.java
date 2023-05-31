/**
 * File      : Segitiga.java		18/03/23
 * Penulis   : Fernanda Galih Saputra
 * Deskripsi : Representasi dasar dari objek segitiga, turunan kelas poligon
 * 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;
    
    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public void printinfo(){
        System.out.println("Bangun Segitiga berisi "+this.getJumlahSisi());
    }
}
