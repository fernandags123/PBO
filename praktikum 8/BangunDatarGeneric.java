/**
 * File      : BangunDatarGeneric.java
 * Penulis   : Sulthan Firmansyah / 24060121140108
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 *
 */

 public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}


/* 
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

*/

/*
Pertanyaan:
Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !

Jawaban:
Meskipun tidak ada masalah atau perubahan pada kode, kode masih berfungsi tanpa kesalahan. 
Tapi, penggunaan huruf "T" daripada "T1" atau yang lainnya dipilih karena ada konvensi penamaan yang telah ditetapkan. 
jadi, penggunaan huruf "T" lebih umum.

 */