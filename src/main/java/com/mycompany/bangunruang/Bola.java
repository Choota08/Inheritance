/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author SMK TELKOM 35
 */
public class Bola {
      double r;
  
    
    double volume(){
        double volume = (double) (Math.PI*r*r*r*4/3);
        System.out.println("volume bola: " + volume);
        return volume;
    }

  
}
