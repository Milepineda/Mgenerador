/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Generador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milena
 */
public class CaracterHelper {
    
    private CaracterDibujable ob;
    public CaracterHelper(CaracterDibujable ob){
        this.ob =ob;

    }
    public void recibePalabra(){
        
    }
    
    public void imprimirPalabra(){
        
        System.out.println();
        System.out.println(this.ob.dibujar());
    }
    
    public void initvalida(){
        
    }
    
    public static void main(String[] args) {
        MetaGenerador meta = new MetaGenerador();
        List<String> lista = new ArrayList<String>();
        lista.add("alto");
        lista.add("cosa");
        lista.add("mula");
        lista.add("dedo");
        lista.add("algo");
        lista.add("dado");

        String palabra = "cosa";
        for(int i=0; i<lista.size(); i++){
            
            if(lista.get(i).equals(palabra)){
                System.out.println("es igual"); 
                for(int j=0; j<palabra.length(); j++){
                    String nuevo = palabra.substring(j,j+1);
//                     System.out.println(nuevo); 
                     meta.setPalabralfabeto(nuevo);
                     CaracterHelper caracterhelp = new CaracterHelper(meta);
                     caracterhelp.imprimirPalabra();
                }
               
            }
        
         }
//        System.out.println(meta.getPalabralfabeto());
//        CaracterHelper caracterhelp = new CaracterHelper(meta);
//        caracterhelp.imprimirPalabra();
    }
}
