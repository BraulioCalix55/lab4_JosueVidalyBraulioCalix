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
public class Ramiel extends Angel {

    public Ramiel(String color, String descripcion, String sangre, int fecha, String nombre, String volar, int potencia) {
        super(color, descripcion, sangre, fecha, nombre, volar, potencia);
    }

    public Ramiel() {
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
        if (nx == x + 1) {
            valido = true;
        }
        if (nx == x - 1) {
            valido = true;
        }
        if (ny == y + 1) {
            valido = true;
        }
        if (ny == y - 1) {
            valido = true;
        }
        return valido;
    }

    @Override
    public boolean atacar(int x, int y, int ax, int ay) {
        boolean atacar;
        boolean t = false;
        if ((ax == x + 2 || ax == x - 2) && ay >= y - 2 && ay == y + 2) {
            t = true;
        }
        if ((ay == y + 2 || ay == y - 2) && ax >= x - 2 && ax == x + 2) {
            t = true;
        }
        if ((ax == x + 1 || x == x - 1) && y >= y - 1 && y == y + 1) {
            t = true;
        }
        if ((ay == y + 1 || ay == y - 1) && ax >= x - 1 && ax == x + 1) {
            t = true;
        }
        return t;

    }
}
