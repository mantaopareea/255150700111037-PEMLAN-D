public class Kategori {

    String namaKategori;
    Buku[] daftarBuku = new Buku[5];

    Kategori(String namaKategori, Buku b1, Buku b2, Buku b3, Buku b4, Buku b5) {
        this.namaKategori = namaKategori;

        daftarBuku[0] = b1;
        daftarBuku[1] = b2;
        daftarBuku[2] = b3;
        daftarBuku[3] = b4;
        daftarBuku[4] = b5;
    }

    void display() {

        System.out.println("\n===== Kategori: " + namaKategori + " =====");

        for (int i = 0; i < daftarBuku.length; i++) {
            daftarBuku[i].display();
        }
    }

}