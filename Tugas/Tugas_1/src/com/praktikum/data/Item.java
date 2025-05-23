package com.praktikum.data;

public class Item {
    private String namaBarang;
    private String deskripsiBarang;
    private String lokasiDitemukan;
    private String statusBarang;

    public Item(String namaBarang, String deskripsiBarang, String lokasiDitemukan, String statusBarang) {
        this.namaBarang = namaBarang;
        this.deskripsiBarang = deskripsiBarang;
        this.lokasiDitemukan = lokasiDitemukan;
        this.statusBarang = statusBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getDeskripsiBarang() {
        return deskripsiBarang;
    }

    public String getLokasiDitemukan() {
        return lokasiDitemukan;
    }

    public String getStatusBarang() {
        return statusBarang;
    }

    public void setStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
    }
}
