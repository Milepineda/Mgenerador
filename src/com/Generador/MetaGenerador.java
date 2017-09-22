/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Generador;

/**
 *
 * @author milena
 */
public class MetaGenerador implements CaracterDibujable{
    
//   
    private String palabralfabeto;

    public String getPalabralfabeto() {
        return palabralfabeto;
    }

    public void setPalabralfabeto(String palabralfabeto) {
        this.palabralfabeto = palabralfabeto;
    }

    @Override
    public String dibujar() {
        return this.palabralfabeto+"\n";
    }
}
