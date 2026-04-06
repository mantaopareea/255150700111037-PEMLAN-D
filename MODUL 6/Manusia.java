public class Manusia {
    private boolean menikah;
    private String nama;
    private boolean jenisKelamin;
    private String nik;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah; 
    }

    public double getTunjangan(){
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else return 20;
        } 
        return 15;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        return "nama : " + nama +
               "\nnik : " + nik +
               "\njenisKelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\npendapatan : " + getPendapatan();
    }
}
