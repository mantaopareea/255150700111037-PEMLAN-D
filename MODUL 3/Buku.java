public class Buku {

    String judul;
    int tahun;
    Penulis penulis;
    String sinopsis;
    int penjualan;

    Buku(String judul, int tahun, Penulis penulis, String sinopsis) {
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.penjualan = 100; // contoh jumlah buku terjual per bulan
    }

    void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Tahun: " + tahun);
        System.out.println("Penulis: " + penulis.nama);
        System.out.println("Negara: " + penulis.negara);
        System.out.println("Sinopsis: " + sinopsis);

        double harga = 50000;

        System.out.println("Royalti 10%: " + hitungRoyalti(harga));
        System.out.println("Royalti custom 15%: " + hitungRoyalti(harga, 15));

        System.out.println("-----------------------------------");
    }

    double cekKesamaan(Buku bukuLain) {

        int sama = 0;
        int total = sinopsis.length();

        for (int i = 0; i < total && i < bukuLain.sinopsis.length(); i++) {
            if (sinopsis.charAt(i) == bukuLain.sinopsis.charAt(i)) {
                sama++;
            }
        }

        return (double) sama / total * 100;
    }

    Buku copy() {
        return new Buku(judul, tahun, penulis, sinopsis);
    }

    // Method 1 parameter
    double hitungRoyalti(double harga) {
        return harga * penjualan * 0.10;
    }

    // Method 2 parameter
    double hitungRoyalti(double harga, double persen) {
        return harga * penjualan * (persen / 100);
    }

}