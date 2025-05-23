public class Barang {
    private String NamaBarang;
    private int Stok_Barang;

    Barang(String Barang, int Stok){
        this.NamaBarang = Barang;
        this.Stok_Barang = Stok;
    }

    String getNama(){return NamaBarang;}
    int getStok_Barang(){return Stok_Barang;}
    void setStok_Barang(int Stok){this.Stok_Barang = Stok;}
}
