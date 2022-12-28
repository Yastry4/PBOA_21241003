package com.tutorial;

public class segitiga extends BangunDatar {
    float alas;
    float tinggi;
   

    public void setSegitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        
    }
    void luas() {
        float luas = 1/2 * alas * tinggi;
        System.out.println("Alas Segitiga : " + luas);
    }
    void keliling() {
        float kll = 3 * alas ;
        System.out.println("Keliling Persegi Panjang : " + kll);
    }

}