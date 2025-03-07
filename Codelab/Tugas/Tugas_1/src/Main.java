import java.util.Scanner;

public class Main {
    static String admin = "Admin358";
    static String Password = "Password358";
    static String nama = "REYHAN ADITYA PRASTYO";
    static String NIM = "202410370110358";

    static int login(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan :");
        int pilihan = input.nextInt();
        return pilihan;
    }

    static void Admin(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username :");
        String Username = input.nextLine().toUpperCase();
        System.out.print("Masukkan Password :");
        String password = input.nextLine().toUpperCase();
        input.close();

        if ( Username.equals(admin) && password.equals(Password)) {
            System.out.println("Login admin Berhasil");
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }
    }
    static void Mahasiswa(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama :");
        String Nama = input.nextLine().toUpperCase();
        System.out.print("Masukkan NIM :");
        String Nim = input.nextLine().toUpperCase();
        input.close();

        if ( Nama.equals(nama) && Nim.equals(NIM)) {
            System.out.println("Login admin Berhasil");
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Login :");
        int pilihan;
        do {
            pilihan = login();
            if (pilihan == 1) {
                Admin();
            } else if (pilihan == 2) {
                Mahasiswa();
            } else {
                System.out.println("Pilihan Tidak Valid");
            }
        }while(pilihan != 1 && pilihan != 2);
        input.close();
    }
}