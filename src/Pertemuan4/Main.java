
package Pertemuan4;


public class Main {
    public static void main(String[] args) {
        Karyawan karyawanBiasa = new Karyawan("Budi", 3000000);
        Manajer manajer = new Manajer("Sari", 7000000, "Keungan");
        
        System.out.println("Data karyawan");
        karyawanBiasa.tampilkanInfo();
        
        System.out.println("\nData Manajaer");
        manajer.tampilkanInfo();
                
                
    }
    
}
