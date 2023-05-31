/**
 * File      : Lingkaran.java
 * Penulis   : Fernanda Galih Saputra / 24060121140176
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 *
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
    
}
