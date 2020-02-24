package Entidades;

public class Ecine {

    private int ID;
    private String Tipo;

    private String Localidad;
    private double Total;

    public Ecine() {
    }

    public Ecine(int ID, String Tipo , String Localidad, double Total) {
        this.ID = ID;
        this.Tipo=Tipo;
      
        this.Localidad = Localidad;
        this.Total = Total;
      
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

   

}
