/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author SMK TELKOM 35
 */
public class LimasSegitiga {
    double luasAlas, tinggi;
    
    double volume(){
    double volume =luasAlas*tinggi/3;
        System.out.println("Volume limas segitiga: "+volume);
        return volume;
        
    }
}
