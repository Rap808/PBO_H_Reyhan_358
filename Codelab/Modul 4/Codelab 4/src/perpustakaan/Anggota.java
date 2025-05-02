package perpustakaan;

public class Anggota implements Peminjaman {
    String Nama;
    String IdAnggota;

    private String Judul;
    //private int LamaPeminjaman;

    public Anggota(String Nama,String IdAnggota){
        this.Nama = Nama;
        this.IdAnggota = IdAnggota;
    }

    public void TampilkanAnggota(){
        System.out.println("Anggota :"+Nama+" (ID :"+IdAnggota+")");
    }
    @Override
    public void kembalikanBuku(){
        System.out.println(Nama + " Mengembalikan Buku Berjudul : " + Judul);
    }

    public void pinjamBuku(String Judul){
        this.Judul = Judul;
        System.out.println(Nama +" Meminjam Buku Berjudul : " + Judul );
    }
    public void pinjamBuku(String Judul, int LamaPeminjaman){
        System.out.println(Nama +" Meminjam Buku Berjudul : " + Judul + " Selama " + LamaPeminjaman + " Hari");
        this.Judul = Judul;
    }
}