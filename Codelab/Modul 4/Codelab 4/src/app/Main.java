package app;
import java.util.Scanner;
import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        Anggota Member1 = new Anggota("Reyhan","H358");
        Anggota Member2 = new Anggota("Yazid","H332");
        Fiksi buku1 = new Fiksi("Harry Potter and the Sorcerer's Stone","J.K. Rowling");
        NonFiksi buku2 = new NonFiksi("Ikigai","Hector Garcia & Francesc Miralles");

        int pilihan;
        do {
            System.out.println("1. Tampilkan Judul Buku");
            System.out.println("2. Tampilkan Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");

            System.out.print("Masukkan Pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    buku1.displayInfo();
                    buku2.displayInfo();

                case 2:
                    Member1.TampilkanAnggota();
                    Member2.TampilkanAnggota();


                case 3:
                    Member1.pinjamBuku(buku1.getJudul());
                    Member2.pinjamBuku(buku2.getJudul(), 3);


                case 4:
                    Member1.kembalikanBuku();
                    Member2.kembalikanBuku();

                case 5:
                    System.out.println("Sampai Jumpa Lagi");
                    break;
            }
        }while (pilihan <  1 || pilihan > 5);
    }
}
