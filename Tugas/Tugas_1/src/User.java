public class User {
    private String Nim ;
    private String Nama;

    public User(String Nim,String Nama){
        this.Nim = Nim;
        this.Nama = Nama;
    }
    void setNim(String nim){this.Nim = nim;}
    String getNim(){return Nim;}
    void setNama(String nama){this.Nama = nama;}
    String getNama(){return Nama;}

    void First(){
        System.out.println("Selamat Datang >_<");
    }
    void Last(){
        System.out.println("\n\n===== Execution Successful =====");
    }
    boolean Login(String Username, String password){return true;}
    void DisplayInfo(){}
}

