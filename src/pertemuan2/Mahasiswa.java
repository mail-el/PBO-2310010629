 
package pertemuan2;


public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        
    }
    //method mutator (Setter)
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }
    //method accessor (Getter)
    public String getJurusan() {
        return jurusan;   
    }
    
    public void tampilkanData() {
            System.out.println("Nama   : " + nama);
            System.out.println("NIM     : " + nim);
            System.out.println("Jurusan : "+ jurusan);
            System.out.println();
    }
    
}
