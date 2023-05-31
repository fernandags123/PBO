/*
	AngkaSialException.java  30/03/2023
    Nama / NIM    : Fernanda Galih Saputra / 24060121140176
	Deskripsi     : Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super ("Jangan masukan angka 13 karena angka sial !!!");
    }
}
