/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author SMK TELKOM 35
 */
public class Tabung {
    double r,tinggi;
    
    
    double volume(){
    double volume =(double)(Math.PI*r*r*tinggi);
        System.out.println("Volume tabung: "+volume);
        return volume;
}
}
