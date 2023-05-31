/**
 * File      : BangunDatarGenericTest.java	
 * Penulis   : Fernanda Galih Saputra / 24060121140176
 * Deskripsi : main class untuk generic bangun datar
 */

 public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        Segitiga s = new Segitiga(3);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        BangunDatarGeneric<Segitiga> bdg2 =
                new BangunDatarGeneric<Segitiga>();
        bdg.set(l);
        bdg2.set(s);
        System.out.println("Keliling lingkaran = " + bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());
        System.out.println("Keliling Segitiga = " + bdg2.hitungKeliling());
        System.out.println("tipe generic : " +bdg2.get().getClass().getName());
    }
}
