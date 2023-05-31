/*
	Asersi2.java  30/03/2023
    Nama / NIM    : Fernanda Galih Saputra / 24060121140176
	Deskripsi     : Program untuk menujukkan asersi
*/

//class Lingkaran
class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jarijari= 0;
        assert(jarijari>0):"Jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling Lingkarang = " + kelilingLingkaran);
    }
}

/*menurut saya secara konsep Asersi2.java sudah tepat, karena ketika dijalankan dimana jarijari = 0 maka akan muncul pesan "Jari jari tidak boleh nol!!!",
 tetapi ketika dijalankan dimana jarijari = 1 maka tidak akan muncul pesan "Jari jari tidak boleh nol!!!", karena asersi sudah benar.
*/
