package com.tutorial;


public class Mahasiswa {
    // Atribut
    public String nim;
    public String nama;
    public String alamat;
    public double ipk;

    // Konstruktor default
    public Mahasiswa() {
        // Tidak melakukan apa-apa
    }

    // Konstruktor dengan satu parameter nim
    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    // Konstruktor dengan parameter lengkap
    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
    }

    // Method untuk menentukan predikat berdasarkan IPK
    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk > 2.75 && ipk <= 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return "Dengan Pujian";
        } else {
            return "-";
        }
    }

    // Method untuk mencetak informasi mahasiswa
    public void cetak() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("IPK: " + ipk);
        System.out.println("Predikat: " + predikat(ipk));
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        Mahasiswa mahasiswa1 = new Mahasiswa("A11.2022.14733", "Helmi azkia", "Jl. Pagiyanten No. 123", 3.4);
        mahasiswa1.cetak();
    }
}

