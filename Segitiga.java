/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objekganjil;
/**
 *
 * @author LOQ
 */
public class Segitiga {
    
    double alas;
    double tinggi;
    double sisi;
    
    Segitiga(){
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }
    
    Segitiga(double alasBaru, double tinggiBaru, double sisiBaru){
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    double getLuas(){
        return 0.5 * alas * tinggi;
    }
    
    double getKeliling(){
        return alas + sisi + sisi;
    }
    
    void setAlas(double alasBaru){
        alas = alasBaru;
    }
    
    void setTinggi(double tinggiBaru){
        tinggi = tinggiBaru;
    }
    
    void setSisi(double sisiBaru){
        sisi = sisiBaru;
    }
    
}