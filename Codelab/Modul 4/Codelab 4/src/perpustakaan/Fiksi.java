package perpustakaan;

public class Fiksi extends Buku{

    public Fiksi(String Judul,String Penulis){
        super(Judul,Penulis);
        this.Judul = Judul;
        this.Penulis = Penulis;
    }
    @Override
    public void displayInfo(){
        System.out.println(Judul + " oleh " + Penulis);
    }
    public String getJudul(){
        return Judul;
    }
}
