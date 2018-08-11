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
public class EVA_00 extends Evas {

    public EVA_00(String color, int produccion, int altura, String alma, int ojos, String pais, Piloto piloto, int codigo, int dano) {
        super(color, produccion, altura, alma, ojos, pais, piloto, codigo, dano);
    }

    public EVA_00() {
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
        boolean atacar=false;
        if (ay==y && ax==x+1) {
            atacar=true;
        }
          if (ay==y && ax==x-1) {
            atacar=true;
        }
          if (ay+ax==y+x) {
            atacar=true;
        }
          if (ax-ay==x-y) {
            atacar=true;
        }
          if (ay-ax==y-x) {
            atacar=true;
        }
          return atacar;
    }
}
