public class KarakterGame {
    private String Nama;
    private int Kesehatan;

    KarakterGame(String Nama,int Kesehatan){
        this Nama = Nama;
        this Kesehatan = Kesehatan;
        System.out.println(Nama+" Memiliki Kesehatan "+Kesehatan);
    }
    public int Kesehatan(){
        return Kesehatan;
    }
    public void Kesehatan(int Kesehatan){
        this Kesehatan = Kesehatan;
    }
    void Serang(KarakterGame target){

    }
}
class Pahlawan extends KarakterGame{
    void Serang(KarakterGame target){
        System.out.println(Nama+"Menyerang"+Nama+"Menggunakan Pedang");
    }
}
class Musuh extends KarakterGame{
    void Serang(KarakterGame target){
        System.out.println(Nama+"Menyerang"+Nama+"Menggunakan Pedang");
    }
}