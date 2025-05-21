public class Mobil {
    String Warna;
    int tahunProduksi;
    int nomor_mesin;
    int nomor_rangka;

    public static void main(String[] args) {
        Mobil mobilNiaga = new Mobil();
        // Pemanggilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();

    }

    // Mengisi variabel intance
    void isi() {
        Warna = "merah"
        tahunProduksi = 2008
        nomor_mesin = 1234
        nomor_rangka =123
    }// menampilkan isi variabel

    void tampil();

}
