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
class Admin extends User{

    Admin(String Nama,String Nim){
        super(Nama,Nim );
    }
    @Override
    boolean Login(String Username,String password) {

        String admin = "admin358";
        String password1 = "password358";
        return Username.equals(admin) && password.equals(password1);
    }

    @Override
    void DisplayInfo() {
        System.out.println("Nama    :"+getNama());
        System.out.println("NIM     :"+getNim());
    }
}
class Mahasiswa extends User{
    Mahasiswa(String Nama,String Nim){
        super(Nama,Nim);
    }
    @Override
    boolean Login(String Input_nama,String Input_nim){

        return Input_nama.equals(getNama()) && Input_nim.equals(getNim());
    }
    @Override
    void DisplayInfo(){
        System.out.println("Nama    :"+getNama());
        System.out.println("NIM     :"+getNim());
    }
}
