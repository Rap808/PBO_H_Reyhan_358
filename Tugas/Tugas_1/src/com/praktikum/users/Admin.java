package com.praktikum.users;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Iterator;
import com.praktikum.actions.AdminAction;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

public class Admin extends User implements AdminAction {
    Scanner input = new Scanner(System.in);
    static int pilihanAdmin;
    private String password1 = "password358";
    public String getPassword1() {
        return password1;
    }
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
    public String getAdmin() {
        return "admin358";
    }

    public static final String Merah = "\u001B[31m";
    public static final String Hijau = "\u001B[32m";
    public static final String Reset = "\u001B[0m";

    public Admin(String Nim, String Nama){
        super(Nim,Nama);
    }
    @Override
    public void DisplayInfo(String nama,String nim) {
        System.out.println("Nama    :"+getNama());

    }

    @Override
    public void DisplayAppMenu() {
        System.out.println("Menu Admin :");
        do {
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Masukkan Pilihan :");
            pilihanAdmin = input.nextInt();

            switch (pilihanAdmin) {
                case 1:
                    ManageItem();
                    break;
                case 2:
                    ManageUser();
                    break;
                case 0:
                    System.out.println("-_-");
                    break;
                default:
                    System.out.println("Inputan Tidak Valid\n");
            }
        }while (pilihanAdmin != 0);
    }

    @Override
    public void ManageItem() {
        System.out.println("Detail Barang Ditemukan :");
        int i = 0;
        if(LoginSystem.reportedItem.isEmpty()){
            System.out.println("Tidak Ada Barang Yang Dilaporkan");
        }
        for (Item laporan : LoginSystem.reportedItem) {
            System.out.println(i +" Nama Barang      : " + laporan.getNamaBarang());
            System.out.println(   " Deskripsi Barang : " + laporan.getDeskripsiBarang());
            System.out.println(   " Tempat Ditemukan : " + laporan.getLokasiDitemukan());
            if(laporan.getStatusBarang().equals("Reported")) {
                System.out.println(" Status Barang : " +Hijau+ laporan.getStatusBarang()+Reset);
            } else if (laporan.getStatusBarang().equals("Claimed")) {
                System.out.println(" Status Barang : " +Merah+ laporan.getStatusBarang()+Reset);
            }
            System.out.println("-----------------------------------------------------------");
            i+=1;
        }
        System.out.println();
        System.out.println("1. Ambil Barang ");
        System.out.println("0. Keluar");
        System.out.print("Masukkan Pilihan : ");
        int pilih = input.nextInt();

        if(pilih == 1){
            System.out.print("Masukkan Indeks Barang Yang Ingin Diambil :");
            try {
                int indeks = input.nextInt();

                Item Barang = LoginSystem.reportedItem.get(indeks);
                if(Barang.getStatusBarang().equals("Claimed")){
                    System.out.println("Barang Sudah Diambil");
                }else{
                    Barang.setStatusBarang("Claimed");
                    System.out.println("Barang Berhasil Diambil");
                }

            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Pilihan Tidak Valid");
            }

        }
    }

    @Override
    public void ManageUser () {
        System.out.println("1. Tambahkan Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.println("0. Kembali");
        System.out.print("Masukkan Pilihan : ");
        try {
            int pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String Nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa : ");
                    String Nim = input.nextLine();

                    LoginSystem.userList.add(new Mahasiswa(Nim, Nama));
                    System.out.println("Mahasiswa Berhasil Ditambahkan");
                    break;
                case 2:
                    Iterator<User> userIterator = LoginSystem.userList.iterator();
                    boolean Ditemukan = false;
                    System.out.print("Masukkan NIM Mahasiswa Yang Ingin Dihapus : ");
                    String CariNIM = input.nextLine();

                    while (userIterator.hasNext()) {
                        User user = userIterator.next();
                        if (user instanceof Mahasiswa && user.getNim().equals(CariNIM)) {
                            userIterator.remove();
                            System.out.println("Nama : " + user.getNama() + " - " + user.getNim() + " Berhasil Dihapus");
                            Ditemukan = true;
                            break;
                        }
                    }
                    if (!Ditemukan) {
                        System.out.println("Mahasiswa Dengan NIM Tersebut Tidak Ditemukan");
                    }
                    break;
                case 0:
                    System.out.println("Kembali ke menu sebelumnya.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silahkan masukkan angka.");
            input.nextLine();
        }
    }


}