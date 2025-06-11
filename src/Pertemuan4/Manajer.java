
package Pertemuan4;


public class Manajer extends Karyawan {
    private String dapartemen;
    
    public Manajer(String nama, double gaji, String dapartemen) {
        super(nama, gaji);
        this.dapartemen = dapartemen;
        
                
    }
    
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Dapartemen: " + dapartemen);
    }
    
    public String getDapartemen(){
        return dapartemen;
    }
    
    public void setDapartemen(){
        this.dapartemen = dapartemen;
    }
    
}
