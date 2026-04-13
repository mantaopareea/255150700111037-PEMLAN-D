public class MainKue{
    public static void main(String[] args) {

        Kue[] kueArray = new Kue[20];

        //10 kue pesanan
        kueArray[0] = new KuePesanan("Lapis", 10000, 1.5);
        kueArray[1] = new KuePesanan("Brownies", 12000, 2.0);
        kueArray[2] = new KuePesanan("Cheesecake", 15000, 1.2);
        kueArray[3] = new KuePesanan("Tiramisu", 18000, 1.0);
        kueArray[4] = new KuePesanan("Blackforest", 20000, 2.5);
        kueArray[5] = new KuePesanan("Red Velvet", 17000, 1.8);
        kueArray[6] = new KuePesanan("Pandan", 18000, 2.2);
        kueArray[7] = new KuePesanan("Coklat", 13000, 1.7);
        kueArray[8] = new KuePesanan("Vanilla", 9000, 1.4);
        kueArray[9] = new KuePesanan("Strawberry", 14000, 1.6);

        //10 kue jadi
        kueArray[10] = new KueJadi("Donat", 5000, 10);
        kueArray[11] = new KueJadi("Klepon", 4000, 15);
        kueArray[12] = new KueJadi("Onde-onde", 4500, 12);
        kueArray[13] = new KueJadi("Cupcake", 6000, 8);
        kueArray[14] = new KueJadi("Bolu", 5500, 9);
        kueArray[15] = new KueJadi("Sus", 3000, 20);
        kueArray[16] = new KueJadi("Pie", 7000, 7);
        kueArray[17] = new KueJadi("Croissant", 8000, 6);
        kueArray[18] = new KueJadi("Macaron", 9000, 5);
        kueArray[19] = new KueJadi("Eclair", 7500, 11);

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = kueArray[0];
        
        System.out.printf("%-15s %-20s %-15s %-15s %-20s\n", 
              "Jenis", "Nama", "Harga", "Berat/Jumlah", "Harga Akhir");
        System.out.println("====================================================================================================");

        for (Kue k : kueArray) {

            String jenis = "";
            String extra = "";

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                 jenis = "KuePesanan";
                extra = String.format("%.2f kg", kp.getBerat());

                totalHargaPesanan += kp.hitungHarga();
                totalBerat += kp.getBerat();

            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                jenis = "KueJadi";
                extra = String.format("%.0f pcs", kj.getJumlah());

                totalHargaJadi += kj.hitungHarga();
                totalJumlah += kj.getJumlah();
            }
            double hargaAkhir = k.hitungHarga();
            totalHarga += hargaAkhir;

            System.out.printf("%-15s %-20s %-15s %-15s %-20s\n", jenis, k.getNama(), k.harga, extra,hargaAkhir);

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("====================================================================================================");

        System.out.println("\nRINGKASAN");
        System.out.printf("Total Semua Harga     : Rp%,.2f\n", totalHarga);

        System.out.println("\nKuePesanan:");
        System.out.printf("Total Harga           : Rp%,.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat           : %.2f kg\n", totalBerat);

        System.out.println("\nKueJadi:");
        System.out.printf("Total Harga           : Rp%,.2f\n", totalHargaJadi);
        System.out.printf("Total Jumlah          : %.0f pcs\n", totalJumlah);

        System.out.println("\nKue Termahal:");
        System.out.printf("Nama Kue              : %s\n", kueTermahal.getNama());
        System.out.printf("Harga                 : %sRp%,.2f\n", "", kueTermahal.hitungHarga());
    }
}