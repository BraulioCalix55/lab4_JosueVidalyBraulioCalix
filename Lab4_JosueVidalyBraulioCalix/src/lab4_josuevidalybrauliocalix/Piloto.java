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
public class Piloto extends Ancestral {

    private String nombre;
    private int edad;
    private String familiar;
    private String encargado;
    private String escuela;
    private int sincronizacion;
    private String eva;

    public Piloto() {
    }

    public Piloto(String nombre, int edad, String familiar, String encargado, String escuela, int sincronizacion, String eva) {
        this.nombre = nombre;
        this.edad = edad;
        this.familiar = familiar;
        this.encargado = encargado;
        this.escuela = escuela;
        this.sincronizacion = sincronizacion;
        this.eva = eva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getSincronizacion() {
        return sincronizacion;
    }

    public void setSincronizacion(int sincronizacion) {
        this.sincronizacion = sincronizacion;
    }

    public String getEva() {
        return eva;
    }

    public void setEva(String eva) {
        this.eva = eva;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre=" + nombre + ", edad=" + edad + ", familiar=" + familiar + ", encargado=" + encargado + ", escuela=" + escuela + ", sincronizacion=" + sincronizacion + ", eva=" + eva + '}';
    }

    @Override
    public boolean moverse(int x, int y, int nx, int ny) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atacar(int x,int y,int ax,int ay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
