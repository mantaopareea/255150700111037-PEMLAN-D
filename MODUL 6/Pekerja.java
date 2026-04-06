import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak,
                   String nama, String nik, boolean jk, boolean menikah){
        super(nama, nik, jk, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus(){
        int lama = LocalDate.now().getYear() - tahunMasuk.getYear();

        if(lama <= 5) return gaji * 0.05;
        else if(lama <= 10) return gaji * 0.10;
        else return gaji * 0.15;
    }

    public double getPendapatan(){
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    public String toString(){
        return super.toString() +
               "\ntahun masuk : " + tahunMasuk +
               "\njumlah anak : " + jumlahAnak +
               "\ngaji : " + gaji;
    }
}