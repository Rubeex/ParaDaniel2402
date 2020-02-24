
package Entidades;

public class Ecliente {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private int Edad;
    private char Sexo;
    private int Cantidad;
  
    
    private Ecliente(){
        
    }

    public Ecliente(String Cedula, String Nombre, String Apellido, int Telefono, int Edad, char Sexo, int Cantidad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono=Telefono;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Cantidad = Cantidad;
     
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
    
    
}
