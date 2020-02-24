/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



public class ESalas {
    
    
    
    private String NPeli;
    private int Sala;
    private String Dia;

    public ESalas() {
    }

    public ESalas(String NPeli, int Sala, String Dia) {
        this.NPeli = NPeli;
        this.Sala = Sala;
        this.Dia = Dia;
    }

    public String getNPeli() {
        return NPeli;
    }

    public void setNPeli(String NPeli) {
        this.NPeli = NPeli;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }
    
    
    
    
}
