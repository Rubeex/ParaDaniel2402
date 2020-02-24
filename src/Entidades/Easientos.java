/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Easientos {

    private int Asiento;
    private boolean ocupad;

    public Easientos() {
    }

    public Easientos(int Asiento, boolean ocupad) {
        this.Asiento = Asiento;
        this.ocupad = ocupad;
    }

    public int getAsiento() {
        return Asiento;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

    public boolean isOcupad() {
        return ocupad;
    }

    public void setOcupad(boolean ocupad) {
        this.ocupad = ocupad;
    }

    
    
    
    

}
