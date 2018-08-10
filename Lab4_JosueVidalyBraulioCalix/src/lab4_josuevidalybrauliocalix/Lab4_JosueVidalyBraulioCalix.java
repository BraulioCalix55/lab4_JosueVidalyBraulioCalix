/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuevidalybrauliocalix;

/**
 *
 * @author User
 */
public class Lab4_JosueVidalyBraulioCalix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[][] Mat = gener();
        imprimat(Mat);
        boolean vivo = true;
        int turno = 1;//1 PARA JUGADOR 1, 2 PARA JUGADOR 2
        while (vivo == true) {
            if (turno == 1) {
                System.out.println("jugador 1");
                turno++;
                //ingresar metodos
            } else if (turno == 2) {
                System.out.println("jugador 2");
                turno--;
                //ingresar metodos
                 vivo=false;
            }
          
        }
    }

    public static String[][] gener() {
        String[][] mat = new String[10][10];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = "   ";
            }
        }
        mat[0][2] = " R ";
        mat[0][7] = " R ";
        mat[1][4] = " S ";
        mat[1][5] = " S ";
        mat[1][1] = " Z ";
        mat[1][8] = " Z ";
        mat[3][2] = " Z ";
        mat[3][8] = " Z ";
        mat[9][0] = "PM ";
        mat[9][2] = "PM ";
        mat[9][3] = "EV0";
        mat[9][4] = "EV1";
        mat[9][5] = "EV2";
        mat[9][6] = "EV0";
        mat[9][7] = " PM";
        mat[9][9] = " PM";
        return mat;
    }

    public static void imprimat(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
