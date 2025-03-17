import java.util.Scanner;

public class RekeningBank {
    Scanner input = new Scanner(System.in);
    //membuat atribut
    String NomorRekening;
    String NamaPemilik;
    double Saldo;

    void tampilkaninfo(){//fungsi untuk menampilkan info
        System.out.println("Nomor Rekening  :"+NomorRekening);
        System.out.println("Nama Pemilik    :"+NamaPemilik);
        System.out.printf("Saldo           :Rp.%.2f\n",Saldo);
    }
    double setorUang(){//fungsi menyetorkan uang
        System.out.print("Masukkan Setoran :");
        double setoran;
        do {
            setoran = input.nextDouble();
            if (setoran >= 0) {
                System.out.println(NamaPemilik + " Menyetor " + setoran + " Saldo Sekarang " + (Saldo + setoran));
            } else {
                System.out.println("Setoran tidak boleh minus");
            }
        }while (setoran < 0);
        return setoran;
    }
    double tarikUang(){//fungsi menarik uang
        System.out.print("Jumlah Penarikan :");
        double Penarikan = input.nextDouble();
        if(Penarikan <= Saldo){
            System.out.println(NamaPemilik+" Menarik "+Penarikan+"(Berhasil) Saldo Sekarang "+(Saldo-Penarikan));
            return Penarikan;
        }else{
            System.out.println(NamaPemilik+" Menarik "+Penarikan+"(Gagal, Saldo Tidak Mencukupi) Saldo Sekarang "+Saldo);
            return 0;
        }
    }
}
