import java.util.Scanner;

public class LoginSystem {
    static User user = new User("202410370110358","REYHAN ADITYA PRASTYO");
    static Mahasiswa mahasiswa = new Mahasiswa("202410370110358","REYHAN ADITYA PRASTYO");
    static Admin admin = new Admin("202410370110358","REYHAN ADITYA PRASTYO","Malang");

    static int login(){
        Scanner input = new Scanner(System.in);
        user.First();
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan :");
        int pilihan = input.nextInt();
        return pilihan;
    }

    static void Login_Admin(){
        Scanner input = new Scanner(System.in);
        boolean login;
        do {
            System.out.print("Masukkan Username :");
            String Username = input.nextLine();
            System.out.print("Masukkan Password :");
            String password = input.nextLine();

            login = admin.Login(Username, password);
            if (login) {
                System.out.println("Login admin Berhasil\n");
                admin.DisplayInfo();
            } else {
                System.out.println("Login gagal! Username atau Password salah.");
            }
        }while (!login);
    }
    static void Login_Mahasiswa(){
        Scanner input = new Scanner(System.in);
        boolean login;
        do {
            System.out.print("Masukkan Nama :");
            String Nama = input.nextLine().toUpperCase();
            System.out.print("Masukkan NIM :");
            String Nim = input.nextLine();

            login = mahasiswa.Login(Nama,Nim);
            if (login) {
                System.out.println("Login Mahasiswa Berhasil\n");
                mahasiswa.DisplayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        }while (!login);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Login :");
        int pilihan;
        do {
            pilihan = login();
            if (pilihan == 1) {
                Login_Admin();
            } else if (pilihan == 2) {
                Login_Mahasiswa();
            } else if (pilihan == 3){
                System.out.println("Sampai jumpa >_<");
                break;
            }else {
                System.out.println("Pilihan Tidak Valid");
            }
        }while(pilihan != 1 && pilihan != 2);
        user.Last();
        input.close();
    }
}