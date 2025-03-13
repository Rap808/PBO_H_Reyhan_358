import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih ;
        do {
            pilih = pilihan();
            RekeningBank rekening1 = new RekeningBank();
            RekeningBank rekening2 = new RekeningBank();

            rekening1.NamaPemilik = "Reyhan";
            rekening1.NomorRekening = "202410370110358";
            rekening1.Saldo = 120000;

            rekening2.NamaPemilik = "Yazid";
            rekening2.NomorRekening = "202410370110332";
            rekening2.Saldo = 103000;

            int akses;
            switch (pilih) {
                case 1:
                    rekening1.tampilkaninfo();
                    System.out.println();
                    rekening2.tampilkaninfo();
                    break;
                case 2:
                    System.out.println("\nSetor Uang Sebagai :");
                    System.out.println("1. "+rekening1.NamaPemilik);
                    System.out.println("2. "+rekening2.NamaPemilik);
                    System.out.print("pilih :");
                    do {
                        akses = input.nextInt();
                        if (akses == 1) {
                            rekening1.setorUang();
                        } else if (akses == 2) {
                            rekening2.setorUang();
                        } else {
                            System.out.println("Pilihan tidak Valid");
                        }
                    } while (akses != 1 && akses != 2);
                    break;
                case 3:
                    System.out.println("\nTarik Uang Sebagai :");
                    System.out.println("1. "+rekening1.NamaPemilik);
                    System.out.println("2. "+rekening2.NamaPemilik);
                    System.out.print("pilih :");
                    do {
                        akses = input.nextInt();
                        if (akses == 1) {
                            rekening1.tarikUang();
                        } else if (akses == 2) {
                            rekening2.tarikUang();
                        } else {
                            System.out.println("Pilihan tidak Valid");
                        }
                    } while (akses != 1 && akses != 2);
                    break;
            }
        }while (pilih != 4);
        input.close();
        System.out.println("\n\n\n===== Code Execution Successfull =====");
    }
    static int pilihan (){

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n====== Bank Suka-suka ======");
        System.out.println("Pilihan Opsi :");
        System.out.println("1. Tampilkan Info Rekening");
        System.out.println("2. Setor Uang");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Keluar");
        System.out.print("Pilih :");
        int pilih = input.nextInt();

        return pilih;
    }
}