import java.util.Scanner;

public class RekeningBank {
    Scanner input = new Scanner(System.in);
    String NomorRekening;
    String NamaPemilik;
    double Saldo;

    void tampilkaninfo(){
        System.out.println("Nomor Rekening  :"+NomorRekening);
        System.out.println("Nama Pemilik    :"+NamaPemilik);
        System.out.printf("Saldo           :Rp.%.2f\n",Saldo);
    }
    void setorUang(){
        System.out.print("Masukkan Setoran :");
        double setoran = input.nextDouble();
        System.out.println(NamaPemilik+"Menyetor"+setoran+"Saldo Sekarang"+(Saldo+setoran));
    }
    void tarikUang(){
        System.out.print("Jumlah Penarikan :");
        double Penarikan = input.nextDouble();
        if(Penarikan <= Saldo){
            System.out.println(NamaPemilik+" Menarik "+Penarikan+"(Berhasil) Saldo Sekarang "+(Saldo-Penarikan));
        }else{
            System.out.println(NamaPemilik+" Menarik "+Penarikan+"(Gagal, Saldo Tidak Mencukupi) Saldo Sekarang "+Saldo);
        }
    }
}
