package com.praktikum.users;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.praktikum.actions.MahasiswaAction;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

public class Mahasiswa extends  User implements MahasiswaAction {
    Scanner input = new Scanner(System.in);
    private String NamaBarang;
    private String DeskripsiBarang;
    private String TempatDitemukan;
    private String StatusBarang = "Reported";
    public static final String Merah = "\u001B[31m";
    public static final String Hijau = "\u001B[32m";
    public static final String Reset = "\u001B[0m";

    static int pilihanMahasiswa;

    public Mahasiswa(String Nim, String Nama){
        super(Nim,Nama);
    }

    @Override
    public void DisplayInfo(String nama,String nim){
        System.out.println("Nama    :"+getNama());
        System.out.println("NIM     :"+getNim());
    }

    @Override
    public void DisplayAppMenu() {
        System.out.println("\nMenu Mahasiswa :");
        do {
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Masukkan Pilihan : ");
            try {
                pilihanMahasiswa = input.nextInt();
                input.nextLine();
                switch (pilihanMahasiswa) {
                    case 1:
                        reportItem();
                        break;
                    case 2:
                        ViewReportedItem();
                        break;
                    case 0:
                        System.out.println("-_-");
                }
            }catch (InputMismatchException e){
                System.out.println("Masukkan Angka");
            }
        }while (pilihanMahasiswa != 0);
    }

    @Override
    public void reportItem() {
        try {
            System.out.print("Masukkan Nama Barang : ");
            this.NamaBarang = input.nextLine();
            System.out.print("Deskripsi Barang : ");
            this.DeskripsiBarang = input.nextLine();
            System.out.print("Tempat Ditemukan : ");
            this.TempatDitemukan = input.nextLine();

            Item newItem = new Item(NamaBarang, DeskripsiBarang, TempatDitemukan, StatusBarang);
            LoginSystem.reportedItem.add(newItem);
            System.out.println("Input Telah Diterima. Terima Kasih !!!.\n");
            System.out.println("Total laporan saat ini: " + LoginSystem.reportedItem.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void ViewReportedItem() {
        System.out.println("Detail Barang Ditemukan :");
        boolean reported = false;
        for (Item laporan : LoginSystem.reportedItem) {
            if (laporan.getStatusBarang().equals("Reported")) {
                System.out.println("Nama Barang : " + laporan.getNamaBarang());
                System.out.println("Deskripsi Barang : " + laporan.getDeskripsiBarang());
                System.out.println("Tempat Ditemukan : " + laporan.getLokasiDitemukan());
                System.out.println("Status Barang : " +Hijau+ laporan.getStatusBarang()+Reset);
                System.out.println("-------------------------------------------------");
                reported = true;
            }else if (!reported){
                System.out.println("Semua Barang Sudah Diambil");
            }
        }
        System.out.println("Total laporan: " + LoginSystem.reportedItem.size());
        if (LoginSystem.reportedItem.isEmpty()){
            System.out.println("Tidak Ada Barang Yang Dilaporkan");
        }
        System.out.println();
    }


}
