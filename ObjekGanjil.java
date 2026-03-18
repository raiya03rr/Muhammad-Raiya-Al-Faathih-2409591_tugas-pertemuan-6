/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.objekganjil;
/**
 *
 * @author LOQ
 */ 
public class ObjekGanjil {

    public static void main(String[] args) {
        
        // Cara memanggil kelas dan menginisialisasikan objek 1 dengan alas = 1, tinggi = 1, sisi = 1
        Segitiga objectSegitiga1 = new Segitiga();
        
        // Mencetak alas, tinggi, sisi, luas dan keliling segitiga
        System.out.println("Luas segitiga dengan alas = " + objectSegitiga1.alas + ", tinggi = " + objectSegitiga1.tinggi + ", sisi = " + objectSegitiga1.sisi + " adalah " + objectSegitiga1.getLuas() + ", sedangkan kelilingnya adalah " + objectSegitiga1.getKeliling());
        
        // Cara memanggil kelas dan menginisialisasikan objek 2 dengan alas = 1, tinggi = 1, sisi = 1
        Segitiga objectSegitiga2 = new Segitiga();
        
        // Mengganti nilai alas, tinggi, sisi
        objectSegitiga2.setAlas(30);
        objectSegitiga2.setTinggi(10);
        objectSegitiga2.setSisi(90);
        
        // Mencetak alas, tinggi, sisi, luas dan keliling segitiga
        System.out.println("Luas segitiga dengan alas = " + objectSegitiga2.alas + ", tinggi = " + objectSegitiga2.tinggi + ", sisi = " + objectSegitiga2.sisi + " adalah " + objectSegitiga2.getLuas() + ", sedangkan kelilingnya adalah " + objectSegitiga2.getKeliling());
        
        // Cara memanggil kelas dan menginisialisasikan objek 3 dengan konstruktor spesifik
        Segitiga objectSegitiga3 = new Segitiga(20, 30, 60);
        
        // Mencetak alas, tinggi, sisi, luas dan keliling segitiga
        System.out.println("Luas segitiga dengan alas = " + objectSegitiga3.alas + ", tinggi = " + objectSegitiga3.tinggi + ", sisi = " + objectSegitiga3.sisi + " adalah " + objectSegitiga3.getLuas() + ", sedangkan kelilingnya adalah " + objectSegitiga3.getKeliling());
        
    }
}