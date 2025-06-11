
package pertemuan2;


public class Main {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("M. Ismail", "2310010629", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "2318728", "Teknik Informatika");
        
        System.out.println("Data Mahasiswa Awal");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
        
        mhs2.setJurusan("Teknologi Informasi");
        
        System.out.println("Data Mahasiswa Setelah Perubahan Jurusan");
        mhs2.tampilkanData();
        
        String jurusanMhs1 = mhs1. getJurusan();
        System.out.println("Jurusan M. Ismail adalah: " + jurusanMhs1);
        
    }
    
}
