package com.praktikum.users;

public abstract class User {
    private String Nim ;
    private String Nama;

    public User(String Nim,String Nama){
        this.Nim = Nim;
        this.Nama = Nama;
    }
    void setNim(String nim){this.Nim = nim;}
    public String getNim(){return Nim;}
    void setNama(String nama){this.Nama = nama;}
    public String getNama(){return Nama;}

    //public abstract boolean Login(String Username, String password);
    public void DisplayInfo(String nama,String nim){}
    public abstract void DisplayAppMenu();
}

