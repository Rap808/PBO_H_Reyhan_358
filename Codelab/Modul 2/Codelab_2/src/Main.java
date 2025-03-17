import java.util.Scanner;//memanggil library scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//memanggil scanner kedalam fungsi
        int pilih ;
        RekeningBank rekening1 = new RekeningBank();//membuat objek rekening1
        RekeningBank rekening2 = new RekeningBank();//membuat objek rekening2
        //memberikan nilai kepada atribut dengan menggunakan objek rekening1
        rekening1.NamaPemilik = "Reyhan";
        rekening1.NomorRekening = "202410370110358";
        rekening1.Saldo = 120000;
        //memberikan nilai kepada atribut dengan menggunakan objek rekening2
        rekening2.NamaPemilik = "Yazid";
        rekening2.NomorRekening = "202410370110332";
        rekening2.Saldo = 103000;
        do {
            pilih = pilihan();

            int akses;
            switch (pilih) {
                case 1://mengeluarkan opsi 1 yaitu menampilkan fungsi tampilkan info menggunakan nilai atribut dari objek rekening1 & rekening2
                    rekening1.tampilkaninfo();
                    System.out.println();
                    rekening2.tampilkaninfo();
                    break;
                case 2://mengeluarkan opsi 2 yaitu menyetorkan uang
                    System.out.println("\nSetor Uang Sebagai :");
                    System.out.println("1. "+rekening1.NamaPemilik);
                    System.out.println("2. "+rekening2.NamaPemilik);
                    System.out.print("pilih :");
                    do {
                        akses = input.nextInt();
                        if (akses == 1) {
                            rekening1.Saldo += rekening1.setorUang();
                        } else if (akses == 2) {
                            rekening2.Saldo +=rekening2.setorUang();
                        } else {
                            System.out.print("Pilihan tidak Valid, Masukkan Pilihan lagi :");
                        }
                    } while (akses != 1 && akses != 2);
                    break;
                case 3://mengeluarkan opsi 3 yaitu penarikan uang
                    System.out.println("\nTarik Uang Sebagai :");
                    System.out.println("1. "+rekening1.NamaPemilik);
                    System.out.println("2. "+rekening2.NamaPemilik);
                    System.out.print("pilih :");
                    do {
                        akses = input.nextInt();
                        if (akses == 1) {
                            rekening1.Saldo -= rekening1.tarikUang();
                        } else if (akses == 2) {
                            rekening1.Saldo -= rekening2.tarikUang();
                        } else {
                            System.out.print("Pilihan tidak Valid, Masukkan pilihan lagi :");
                        }
                    } while (akses != 1 && akses != 2);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid, Masukkan Pilihan Kembali.");
                    break;
            }
        }while (pilih != 4);
        input.close();
        System.out.println("\n\n===== Code Execution Successfull =====");
    }
    static int pilihan (){//fungsi untuk memilih opsi

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