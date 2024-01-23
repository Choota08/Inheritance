/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangunruang;

/**
 *
 * @author SMK TELKOM 35
 */
public class BangunRuang {

    public static void main(String[] args) {
        
        Pembuka pembuka = new Pembuka();

        // membuat objek persegi dan mengisi nilai properti
        Kubus kubus = new Kubus();
        kubus.rusuk = 30;

        // membuat objek Lingkaran dan mengisi nilai properti
        Bola bola = new Bola();
        bola.r = 14;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        limasSegitiga.luasAlas = 10;
        limasSegitiga.tinggi = 10;

        // membuat objek Segitiga dan mengisi nilai properti
        Tabung tabung = new Tabung();
        tabung.r = 14;
        tabung.tinggi = 10;

        // memanggil method volume
        pembuka.voloume();
        kubus.volume();
        bola.volume();
        limasSegitiga.volume();
        tabung.volume();
        
        
        
        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 20;
        mSegitiga.tinggi = 8;
        
        
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();

        
    }
}
