public class Mobilku {
    String warna1;
    int tahun_produksi;
    int nomorMesin;
    int nomorRangka;

    // Method mengisi variabel instance
    void isi(String warna1, int tahun_produksi, int nomorMesin, int nomorRangka) {
        this.warna1 = warna1;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;
    }

    // Menthod menampilkan isi variabel
    String ambil_warna() {
        return warna1;
    }

    int ambil_tahun_produksi() {
        return tahun_produksi;
    }

    int ambil_nomorMesin() {
        return nomorMesin;
    }

    int ambil_nomorRangka() {
        return nomorRangka;

    }

    public static void main(String[] args) {
        Mobilku mobilNiaga = new Mobilku();
        // proses pemanggilan method void
        mobilNiaga.isi("unggu", 1997, 027, 397);
        System.out.println("Warna : " + mobilNiaga.ambil_warna());
        System.out.println("Tahun Produksi : " + mobilNiaga.ambil_tahun_produksi());
        System.out.println("Nomor Mesin : " + mobilNiaga.ambil_nomorMesin());
        System.out.println("Nomor Rangka : " + mobilNiaga.ambil_nomorRangka());

    }
}