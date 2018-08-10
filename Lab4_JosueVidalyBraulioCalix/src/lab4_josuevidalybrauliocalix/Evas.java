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
public class Evas extends Ancestral {

    private String color;
    private int produccion;
    private int altura;
    private String alma;
    private int ojos;
    private String pais;
    private Piloto piloto;
    private int codigo;
    private int dano;

    public Evas(String color, int produccion, int altura, String alma, int ojos, String pais, Piloto piloto, int codigo, int dano) {
        this.color = color;
        this.produccion = produccion;
        this.altura = altura;
        this.alma = alma;
        this.ojos = ojos;
        this.pais = pais;
        this.piloto = piloto;
        this.codigo = codigo;
        this.dano = dano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Evas{" + "color=" + color + ", produccion=" + produccion + ", altura=" + altura + ", alma=" + alma + ", ojos=" + ojos + ", pais=" + pais + ", piloto=" + piloto + ", codigo=" + codigo + ", dano=" + dano + '}';
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
