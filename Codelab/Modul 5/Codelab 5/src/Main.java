import java.lang.Exception;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        daftarBarang.add(new Barang("Smartphone",12));
        daftarBarang.add(new Barang("Laptop",15));
        daftarBarang.add(new Barang("Keyboard",20));
        int pilihan;
        do {
            System.out.println("1. Tambahkan Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan :");

            try {
                pilihan = input.nextInt();
                input.nextLine();
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Nama Barang :");
                        String Barang = input.nextLine();
                        System.out.print("Stok Awal :");
                        try {
                            int stok = input.nextInt();
                            daftarBarang.add(new Barang(Barang, stok));
                            System.out.println("Barang Berhasil Ditambahkan");
                        } catch (InputMismatchException e) {
                            System.out.println("Inputan Stok Harus Berupa Integer");
                        }
                        System.out.println();
                        break;
                    case 2:
                        if (daftarBarang.isEmpty()) {
                            System.out.println("Stok Barang Kosong");
                        } else {
                            System.out.println("Daftar Barang :");
                            Iterator<Barang> iterator = daftarBarang.iterator();
                            int i = 0;
                            while (iterator.hasNext()) {
                                Barang b = iterator.next();
                                System.out.println(i++ + ". " + b.getNama() + " - Stok:" + b.getStok_Barang());
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        try {
                            if (daftarBarang.isEmpty()) {
                                System.out.println("Stok Barang kosong");
                                break;
                            }
                            for (int i = 0; i < daftarBarang.size(); i++) {
                                Barang a = daftarBarang.get(i);
                                System.out.println(i +". " + a.getNama() + "- Stok :" + a.getStok_Barang());
                            }
                            System.out.println();
                            System.out.print("Masukkan No Barang :");
                            int urutan = input.nextInt();

                            System.out.print("Masukkan Jumlah :");
                            int Jumlah = input.nextInt();

                            Barang barang = daftarBarang.get(urutan);
                            if (Jumlah > barang.getStok_Barang()) {
                                throw new StokTidakCukup_Exception("Stok untuk " + barang.getNama() + " Hanya Tersisa " + barang.getStok_Barang());
                            }else {
                                barang.setStok_Barang(barang.getStok_Barang() - Jumlah) ;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Berupa Angka");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Urutan Tidak Valid");
                        } catch (StokTidakCukup_Exception e) {
                            System.out.println("ERROR :" + e.getMessage());
                        }
                        System.out.println();
                        break;
                    case 4:
                        try {
                            if (daftarBarang.isEmpty()) {
                                System.out.println("Stok Barang kosong");
                                break;
                            }
                            for (int i = 0; i < daftarBarang.size(); i++) {
                                Barang a = daftarBarang.get(i);
                                System.out.println(i +". " + a.getNama() + "- Stok :" + a.getStok_Barang());
                            }
                            System.out.println();
                            System.out.print("Masukkan No Barang :");
                            int urutan = input.nextInt();

                            System.out.print("Masukkan Jumlah :");
                            int Jumlah = input.nextInt();

                            Barang barang = daftarBarang.get(urutan);

                            daftarBarang.remove(barang);
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Berupa Angka");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Urutan Tidak Valid");
                        }
                    case 0:
                        System.out.println("Sampai Jumpa.");
                        break;
                    default:
                        System.out.println("Pilihan Tidak Valid");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Harus Berupa Angka");
                return;
            }
        }while(pilihan != 0);
        input.close();
    }

}