/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author SMK TELKOM 35
 */
public class Segitiga {
    float alas;
    float tinggi;
    
     float luas() {
        float luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
}
