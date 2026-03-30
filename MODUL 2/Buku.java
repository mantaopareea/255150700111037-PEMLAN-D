public class Buku {

    String judul;
    int tahun;
    Penulis penulis;
    String sinopsis;

    public Buku(String judul, int tahun, Penulis penulis, String sinopsis) {
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public int hitungJumlahKata() {
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    public void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Tahun: " + tahun);
        System.out.println("Penulis: " + penulis.nama);
        System.out.println("Negara: " + penulis.negara);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah kata: " + hitungJumlahKata());
        System.out.println();
    }

    public double cekKesamaan(Buku bukuLain) {
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


}