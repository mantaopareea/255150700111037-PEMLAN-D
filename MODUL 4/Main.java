public class Main {
    public static void main(String[] args) {

        System.out.println("=== Selamat datang di Tiny Swalayan ===");
        System.out.println();
        Akun a = new Akun("7430082019","cia",2000000,"2112");

        if(a.autentikasi("2112")){
            a.beli(1200000);
        }

        System.out.println("Saldo sekarang: " + a.getSaldo());
        System.out.println();
        System.out.println("Terima kasih telah bertransaksi di Tiny Swalayan!");
    }
}
