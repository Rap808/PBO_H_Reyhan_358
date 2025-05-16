class Mahasiswa extends User{
    Mahasiswa(String Nim,String Nama){
        super(Nim,Nama);
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
