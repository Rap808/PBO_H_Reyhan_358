class Admin extends User {
    private String alamat;
    Admin(String Nim,String Nama,String alamat){
        super(Nim,Nama);
        this.alamat = alamat;
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
        System.out.println("Alamat  :"+alamat);
    }
}
