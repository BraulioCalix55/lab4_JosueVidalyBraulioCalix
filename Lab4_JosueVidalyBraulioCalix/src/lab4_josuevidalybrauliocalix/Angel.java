/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuevidalybrauliocalix;

/**
 *
 * @author josue
 */
public class Angel extends Ancestral {

    private String color;
    private String descripcion;
    private String sangre;
    private int fecha;
    private String nombre;
    private String volar;
    private int potencia;

    public Angel(String color, String descripcion, String sangre, int fecha, String nombre, String volar, int potencia) {
        this.color = color;
        this.descripcion = descripcion;
        this.sangre = sangre;
        this.fecha = fecha;
        this.nombre = nombre;
        this.volar = volar;
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Angel{" + "color=" + color + ", descripcion=" + descripcion + ", sangre=" + sangre + ", fecha=" + fecha + ", nombre=" + nombre + ", volar=" + volar + ", potencia=" + potencia + '}';
    }

    @Override
    public boolean moverse(int x, int y, int nx, int ny) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
