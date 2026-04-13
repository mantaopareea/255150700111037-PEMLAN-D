public abstract class Kue{
    private String nama;
    public double harga;

    public Kue(String nama, double harga){
        this.setNama(nama);
        this.harga = harga;
    }

    public String getNama() {
        return nama;
        
    }

    public void setNama(String nama) {
        this.nama = nama;
        
    }

    public abstract double hitungHarga();

    public String toString(){
        return "Nama kue: " + getNama() + ", Harga: " + harga;
    }
}