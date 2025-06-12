package Latihan2;

public class DataDiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;

    // Konstruktor
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // Method untuk menampilkan data diri
    public void tampilkanData() {
        System.out.println("===== DATA DIRI =====");
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }

    // Method utama
    public static void main(String[] args) {
        DataDiri saya = new DataDiri("Muhammad Maulana", "2310010375", "4C");
        saya.tampilkanData();
    }
}
