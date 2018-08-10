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
public class EVA_PM extends Evas {

    public EVA_PM() {
    }

    public EVA_PM(String color, int produccion, int altura, String alma, int ojos, String pais, Piloto piloto, int codigo, int dano) {
        super(color, produccion, altura, alma, ojos, pais, piloto, codigo, dano);
    }

    @Override
    public boolean moverse(int x, int y, int nx, int ny) {
        boolean valido = true;
        return valido;
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
