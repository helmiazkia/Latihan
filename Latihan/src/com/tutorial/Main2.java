package com.tutorial;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

    Mahasiswa(){
        System.out.println("ini adalah construktor");
    }

    //construktor dengan parameter
    Mahasiswa(String inputNama){
        nama = inputNama;
    }

}

    
public class Main2 {
    
    public static void main(String[] args) throws Exception{
        
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup");
        System.out.println(mahasiswa1.nama);

        
    }
}
