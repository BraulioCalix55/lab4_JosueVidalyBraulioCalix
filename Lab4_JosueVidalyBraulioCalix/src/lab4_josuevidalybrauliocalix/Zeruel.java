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
public class Zeruel extends Angel {

    public Zeruel(String color, String descripcion, String sangre, int fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }

    @Override
    public boolean moverse(int x,int y,int nx, int ny) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
