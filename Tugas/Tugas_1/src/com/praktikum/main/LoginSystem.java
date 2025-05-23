package com.praktikum.main;

import com.praktikum.data.Item;
import com.praktikum.error.loginExeptions;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem {
    static public ArrayList<User> userList = new ArrayList<>();
    static public ArrayList<Item> reportedItem = new ArrayList<>();

    public static void main(String[] args) {
        userList.add(new Admin("password358", "Admin358"));
        userList.add(new Mahasiswa("202410370110358", "Reyhan Aditya Prastyo"));

        Scanner scanner = new Scanner(System.in);
        boolean pilih = false;
        System.out.println("\n=== Sistem Login ===");
        do {
            User loggedInUser = null;
            while (loggedInUser == null) {
                System.out.print("Masukkan username/nama: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password/NIM: ");
                String password = scanner.nextLine();

                try {
                    loggedInUser = doLogin(username, password);

                    if (loggedInUser == null) {
                        throw new loginExeptions("\nUser not found!");
                    }

                    System.out.println("Login berhasil!");
                    loggedInUser.DisplayInfo(username, password);
                    loggedInUser.DisplayAppMenu();
                } catch (loginExeptions e) {
                    System.out.println("ERROR: " + e.getMessage());
                    System.out.println("Silahkan coba lagi.\n");
                }
            }
            System.out.print("Apakah Ingin Melanjutkan 1(Yes)/0(No):");
            int lanjut = scanner.nextInt();
            if (lanjut == 0){pilih = true;}
            scanner.nextLine();

        }while (!pilih);

        scanner.close();
        System.out.println("\n\n===== Code Execution Successful =====");
    }

    public static User doLogin(String userInput, String passInput) {
        for (User u : userList) {
            if (u instanceof Admin admin) {
                if (admin.getNama().equals(userInput) && admin.getNim().equals(passInput)) {
                    return admin;
                }
            } else if (u instanceof Mahasiswa mhs) {
                if (mhs.getNama().equals(userInput) && mhs.getNim().equals(passInput)) {
                    return mhs;
                }
            }
        }
        return null;
    }
}