public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();//Membuat objek bernama hewan1
        Hewan hewan2 = new Hewan();//Membuat objek bernama hewan2
        Hewan hewan3 = new Hewan();//membuat objek bernama hewan3

        //memberikan nilai kepada atribut dengan menggunakan objek hewan1
        hewan1.nama = "kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Nyann~~";
        hewan1.warna = "Hitam";
        //memberikan nilai kepada atribut dengan menggunakan objek hewan2
        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Woof-woof";
        hewan2.warna = "Putih";
        //memberikan nilai kepada atribut dengan menggunakan objek hewan3
        hewan3.nama = "Ular";
        hewan3.jenis = "Reptil";
        hewan3.suara = "Mendesis";
        hewan3.warna = "Cokelat & Hijau";

        hewan1.tampilkaninfo();//memanggil method tampilkainfo dengan nilai atribut hewan1
        System.out.println();
        hewan2.tampilkaninfo();//memanggil method tampilkainfo dengan nilai atribut hewan2
        System.out.println();
        hewan3.tampilkaninfo();//memanggil method tampilkainfo dengan nilai atribut hewan3
    }
}