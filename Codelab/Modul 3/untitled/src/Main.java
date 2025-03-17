public class Main {
    public static void main(String[] args) {
        KarakterGame KarakterUmum = new KarakterGame("Karakter Umum",100);
        Pahlawan pahlawan = new Pahlawan();
        Musuh Musuh = new Musuh();

        pahlawan.Nama ="Brimstone";
        pahlawan.Kesehatan = 150;

        Musuh.Nama = "Viper";
        Musuh.Kesehatan = 200;

        pahlawan.Serang();
        Musuh.Serang();
    }
}