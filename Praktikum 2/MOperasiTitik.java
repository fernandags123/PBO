/**
 * File      : MOperasiTitik.java		04/03/23
 * Penulis   : Fernanda Galih Saputra
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 * 
 */

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(3,3);

        OperasiTitik op = new OperasiTitik();

        System.out.printf("Titik t1 : (%.2f, %.2f)\n", t1.getAbsis(), t1.getOrdinat());
        
        Titik t1RefleksiX = op.refleksiX(t1);
        System.out.printf("Titik t1 setelah refleksi sb X : (%.2f, %.2f)\n", t1RefleksiX.getAbsis(), t1RefleksiX.getOrdinat());
        
        Titik t1RefleksiY = op.refleksiY(t1RefleksiX);
        System.out.printf("Titik t1 setelah refleksi sb Y : (%.2f, %.2f)\n", t1RefleksiY.getAbsis(), t1RefleksiY.getOrdinat());
    }
}
