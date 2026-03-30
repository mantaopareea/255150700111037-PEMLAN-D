public class Akun {

    private String noPelanggan;
    private String nama;
    private double saldo;
    private String pin;
    private int salah = 0;
    private boolean blokir = false;

    public Akun(String noPelanggan, String nama, double saldo, String pin){
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }

    public boolean autentikasi(String inputPin){
        if(blokir){
            System.out.println("Akun diblokir!");
            return false;
        }

        if(pin.equals(inputPin)){
            salah = 0;
            return true;
        } else {
            salah++;
            if(salah >= 3){
                blokir = true;
                System.out.println("Akun anda terblokir");
            }
            return false;
        }
    }

    public void topUp(double jumlah){
        saldo += jumlah;
    }

    public void beli(double jumlah){

        double cashback = hitungCashback(jumlah);

        if(saldo - jumlah < 10000){
            System.out.println("Transaksi gagal, saldo minimal 10000");
            return;
        }

        saldo -= jumlah;
        saldo += cashback;

        System.out.println("Transaksi berhasil");
        System.out.println("Cashback: " + cashback);
    }

    private double hitungCashback(double jumlah){

        String kode = noPelanggan.substring(0,2);

        if(kode.equals("38")){
            if(jumlah > 1000000)
                return jumlah * 0.05;
        }

        if(kode.equals("56")){
            if(jumlah > 1000000)
                return jumlah * 0.07;
            else
                return jumlah * 0.02;
        }

        if(kode.equals("74")){
            if(jumlah > 1000000)
                return jumlah * 0.10;
            else
                return jumlah * 0.05;
        }

        return 0;
    }

    public double getSaldo(){
        return saldo;
    }
}