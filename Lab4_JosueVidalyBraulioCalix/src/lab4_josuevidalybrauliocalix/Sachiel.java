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
public class Sachiel extends Angel {

    public Sachiel(String color, String descripcion, String sangre, int fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }

    public Sachiel() {
    }

    @Override
    public boolean moverse(int x, int y, int nx, int ny) {
        boolean valido = false;
        if (nx == x + 1 && ny == y + 1) {
            valido = true;
        }
        if (nx == x - 1 && ny == y - 1) {
            valido = true;
        }
        if (nx == x + 1 && ny == y - 1) {
            valido = true;
        }
        if (nx == x - 1 && ny == y + 1) {
            valido = true;
        }
        return valido;
    }

    @Override
    public boolean atacar(int x, int y, int ax, int ay) {
        boolean atacar = false;
        if (ax == x && ay >= y - 3) {
            atacar = true;
        }
        if (ax == x && ay == y + 3) {
            atacar = true;
        }

        return atacar;

    }
}
