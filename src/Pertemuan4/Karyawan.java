
package Pertemuan4;

public class Karyawan {
    private String nama;
    private double gaji;
    
    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Gaji: " + gaji);
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public double setGaji(){
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
}
