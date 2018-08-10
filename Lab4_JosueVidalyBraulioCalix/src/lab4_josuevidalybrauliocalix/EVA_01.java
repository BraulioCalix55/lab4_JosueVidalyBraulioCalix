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
public class EVA_01 extends Evas {

    public EVA_01(String color, int produccion, int altura, String alma, int ojos, String pais, Piloto piloto, int codigo, int dano) {
        super(color, produccion, altura, alma, ojos, pais, piloto, codigo, dano);
    }

    @Override
    public boolean moverse(int x, int y, int nx, int ny) {
        boolean valido = false;
        if (nx == x + 1 && ny == y + 3) {
            valido = true;
        }
        if (nx == x + 1 && ny == y - 3) {
            valido = true;
        }
        if (nx == x - 1 && ny == y + 3) {
            valido = true;
        }
        if (nx == x - 1 && ny == y - 3) {
            valido = true;
        }
        //
        if (nx == x + 2 && ny == y + 3) {
            valido = true;
        }
        if (nx == x + 2 && ny == y - 3) {
            valido = true;
        }
        if (nx == x - 2 && ny == y + 3) {
            valido = true;
        }
        if (nx == x - 2 && ny == y - 3) {
            valido = true;
        }
        //
        if (nx == x + 3 && ny == y + 1) {
            valido = true;
        }
        if (nx == x + 3 && ny == y - 1) {
            valido = true;
        }
        if (nx == x - 3 && ny == y + 1) {
            valido = true;
        }
        if (nx == x - 3 && ny == y - 1) {
            valido = true;
        }
        //
        if (nx == x + 3 && ny == y + 2) {
            valido = true;
        }
        if (nx == x + 3 && ny == y - 2) {
            valido = true;
        }
        if (nx == x - 3 && ny == y + 2) {
            valido = true;
        }
        if (nx == x - 3 && ny == y - 2) {
            valido = true;
        }
        // esquinas
        if (nx == x - 3 && ny == y - 3) {
            valido = true;
        }
        if (nx == x + 3 && ny == y - 3) {
            valido = true;
        }
        if (nx == x - 3 && ny == y + 3) {
            valido = true;
        }
        if (nx == x + 3 && ny == y + 3) {
            valido = true;
        }

        //cruz
        if (nx == x + 3) {
            valido = true;
        }
        if (nx == x - 3) {
            valido = true;
        }
        if (ny == y + 3) {
            valido = true;
        }
        if (ny == y - 3) {
            valido = true;
        }
        return valido;
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
