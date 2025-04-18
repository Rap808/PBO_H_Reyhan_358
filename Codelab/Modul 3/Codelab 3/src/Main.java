import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Objek beserta parameter
        KarakterGame KarakterUmum = new KarakterGame("Mebius",100);
        Pahlawan pahlawan = new Pahlawan("Arthur",220);
        Musuh musuh = new Musuh("Thor",200);

        System.out.println("GAme Start");
        System.out.println("Status awal :");
        System.out.printf("%s Memiliki Kesehatan %d\n",pahlawan.getNama(),pahlawan.getKesehatan());
        System.out.printf("%s Memiliki Kesehatan %d\n",musuh.getNama(),musuh.getKesehatan());

        do {//Menjalankan program hingga salah satu karakter kehabisan Hp
            pahlawan.Serang(musuh);
            musuh.Serang(pahlawan);
        }while(pahlawan.getKesehatan() >= 0 && musuh.getKesehatan()>=0);

        //perbandingan untuk meentukan pemenang
        if(pahlawan.getKesehatan() > 0){
            System.out.println(pahlawan.getNama()+" Wins");
        } else if (musuh.getKesehatan()> 0) {
            System.out.println(musuh.getNama()+" Wins");
        }
    }


}