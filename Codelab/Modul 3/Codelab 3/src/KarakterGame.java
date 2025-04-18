public class KarakterGame {
    private String Nama;
    private int Kesehatan;
    //Constructor yang membawa nilai dari main class
    KarakterGame(String Nama,int Kesehatan){
        this.Nama = Nama;
        this.Kesehatan = Kesehatan;
    }
    //setter dan getter untuk variabel Nama & Kesehatan
    void setNama(String nama) {
        this.Nama = nama;
    }
    String getNama() {
        return Nama;
    }
    void setKesehatan(int kesehatan) {
        this.Kesehatan = kesehatan;
    }
    int getKesehatan() {
        return Kesehatan;
    }
    void Serang(KarakterGame target){

    }
}
class Pahlawan extends KarakterGame{
    public Pahlawan(String Nama,int Kesehatan){
        super(Nama,Kesehatan);
    }
    @Override
    //meng override fungsi serang untuk serangan pahlawan
    void Serang(KarakterGame target){
        target.setKesehatan(target.getKesehatan()-35);
        System.out.printf("%s Menyerang %s menggunakan excalibur\n",getNama(),target.getNama());
        if(target.getKesehatan() >= 0){
            System.out.println("Sisa Hp "+target.getNama()+" "+target.getKesehatan());
        }else{
            System.out.println("Hp telah habis ");
        }
    }
}
//keturunan dari class KarakterGame untuk serangan musuh
class Musuh extends KarakterGame{
    public Musuh(String Nama,int Kesehatan){
        super(Nama,Kesehatan);
    }
    //meng override fungsi serang untuk serangan musuh
    void Serang(KarakterGame target){
        target.setKesehatan(target.getKesehatan()-35);
        System.out.printf("%s Menyerang %s menggunakan Mjolnir\n",getNama(),target.getNama());
        if(target.getKesehatan() >= 0){
            System.out.println("Sisa Hp "+target.getNama()+" "+target.getKesehatan());
        }else{
            System.out.println("Hp telah habis ");
        }
    }
}