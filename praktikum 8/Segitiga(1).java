/**
 * File      : Segitiga.java
 * Penulis   : Sulthan Firmansyah / 24060121140108
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 *
 */

 public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}