package com.tutorial;

public class Main {
    public static void main(String[] args)  {
       //membuat objek bangun datar
       BangunDatar bangunDatar = new BangunDatar();

       //membuat objek persegi
       persegi persegi1 = new persegi();
       persegi1.setSisi(2);

       //membuat objek segitiga
       segitiga segitiga1 = new segitiga();
        segitiga1.setSegitiga(18, 4);

        //membuat objek persegi panjang
        persegiPanjang persegiPanjang1 = new persegiPanjang();
        persegiPanjang1.setpersegiPanjang(6, 4);

        //membuat objek lingkaran
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setR(4);

        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("========PERSEGI========");
        persegi1.luas();
        persegi1.keliling();

        System.out.println("========SEGITIGA========");
        segitiga1.luas();
        segitiga1.keliling();

        System.out.println("========PERSEGI PANJANG========");
        persegi1.luas();
        persegi1.keliling();

        System.out.println("========LINGKARAN========");
        lingkaran1.luas();
        lingkaran1.keliling();
    }
}

