/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuevidalybrauliocalix;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4_JosueVidalyBraulioCalix {

    /**
     * @param args the command line arguments
     */
    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
//CRUD ( CREATE , READ , UPDATE ,DELETE ) 
        int salir = 0;
        ArrayList p = new ArrayList();
        ArrayList<Angel> A = new ArrayList();
        while (salir != 5) {
            System.out.println("Bienvenido a Nerv\nOPCIONES"
                    + "\nELIGA UNA OPCION "
                    + "\n1)Lista de EVAs"
                    + "\n2)Lista de angeles"
                    + "\n3)CRUD Pilotos"
                    + "\n4)Simulacion"
                    + "\n5)Salir");
            int Opc = lea.nextInt();
            switch (Opc) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3://CRUD ( CREATE , READ , UPDATE ,DELETE )

                    System.out.println("ingrese que quiere hacer:"
                            + "\n1)crear un piloto"
                            + "\n2)listar pilotos"
                            + "\n3)modificar un piloto"
                            + "\n4)borrar un piloto");
                    int Tpilo = lea.nextInt();
                    switch (Tpilo) {
                        case 1:
                            //String nombre, int edad, String familiar, String encargado, String escuela, int sincronizacion, String eva)
                            System.out.println("ingrese el nombre del piloto");
                            String nombre = lea.nextLine();
                            System.out.println("ingrese la edad");
                            int edad = lea.nextInt();
                            System.out.println("ingrese el nombre delfamiliar mas cercano");
                            String familiar = lea.nextLine();
                            System.out.println("ingrese el nombre del encargado");
                            String encargado = lea.nextLine();
                            System.out.println("ingrese la escuela");
                            String escuela = lea.nextLine();
                            System.out.println("ingrese la sincronizacion(numero)");
                            int sincronizacion = lea.nextInt();
                            System.out.println("ingrese el eva asignado");
                            String eva = lea.nextLine();
                            p.add(new Piloto(nombre, edad, familiar, encargado, escuela, sincronizacion, eva));
                            break;
                        case 2:
                            System.out.println(p);
                            break;
                        case 3:
                            System.out.println("ingrese la posicion del piloto que desea modificar");
                            int modifi = lea.nextInt();
                            System.out.println("que desea modificar?"
                                    + "\n1)nombre"
                                    + "\n2edad"
                                    + "\n3)familiar mas cercano"
                                    + "\n4)encargado"
                                    + "\n5)escuela"
                                    + "\n6)sincronizacion"
                                    + "\n7)eva asignada");
                            int Mpiloto = lea.nextInt();
                            switch (Mpiloto) {
                                //String nombre, int edad, String familiar, String encargado, String escuela, int sincronizacion, String eva)
                                case 1:
                                    System.out.println("ingrese nuevo nombre");
                                    String Nnombre = lea.nextLine();
                                    ((Piloto) p.get(Opc)).setNombre(Nnombre);
                                    break;
                                case 2:
                                    System.out.println("ingrese edad");
                                    int Nedad = lea.nextInt();
                                    ((Piloto) p.get(Opc)).setEdad(Nedad);
                                    break;
                                case 3:
                                    System.out.println("ingrese familiar mas cercano");
                                    String Nfamiliar = lea.nextLine();
                                    ((Piloto) p.get(Opc)).setFamiliar(Nfamiliar);
                                    break;
                                case 4:
                                    System.out.println("ingrese encargado");
                                    String Nencargado = lea.nextLine();
                                    ((Piloto) p.get(Opc)).setEncargado(Nencargado);
                                    break;
                                case 5:
                                    System.out.println("ingrese escuela");
                                    String NEscuela=lea.nextLine();
                                     ((Piloto)p.get(Opc)).setEscuela(NEscuela);
                                    break;
                                case 6:
                                    System.out.println("ingrese sincroizacion");
                                    break;
                                case 7:
                                    System.out.println("ingrese eva asignada");
                                    break;
                                default:
                                    System.out.println("opcion invalida");
                                    break;

                            }
                            break;
                        case 4:
                            System.out.println("ingrese la posicion del piloto que desea borrar");
                            int borr = lea.nextInt();
                            p.remove(borr);
                            break;
                    }
                    break;
                case 4:
                    String[][] Mat = gener();
                    imprimat(Mat);
                    //matriz normal
                    boolean vivo = true;
                    int turno = 1;//1 PARA JUGADOR 1, 2 PARA JUGADOR 2
                    while (vivo == true) {
                        if (turno == 1) {
                            JUg1(Mat);
                            turno++;
                        } else if (turno == 2) {
                            JUg2(Mat);
                            turno--;
                            //ingresar metodos
                        }
                    }
                    break;
                default:
                    break;

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

    public static void JUg1(String[][] Mat) {
        System.out.println("jugador 1");

        System.out.println("ingrese la x");
        int x = lea.nextInt();
        while (x < 0 || x > 9) {
            System.out.println("numero invalido\ningrese otro");
            x = lea.nextInt();
        }
        System.out.println("ingrese la y");
        int y = lea.nextInt();
        while (y < 0 || y > 9) {
            System.out.println("numero invalido\ningrese otro");
            y = lea.nextInt();
        }
        System.out.println("que desea hacer \n1)Moverse\n2)Atacar");
        int trab = lea.nextInt();
        System.out.println("selecciono Moverse");
        if (trab == 1) {//MOVERSE
            if (Mat[x][y].equals("EV0")) {
                System.out.println("ingrese la x a la  que lo quiere mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y a la  que lo quiere mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV1")) {
                System.out.println("ingrese la x al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV2")) {
                System.out.println("ingrese la x al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y  al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" R ")) {
                System.out.println("ingrese la x  al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y al que ataca");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" S ")) {
                System.out.println("ingrese la x  al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y  al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" Z ")) {
                System.out.println("ingrese la x  al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y  al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
            }
        } else {//ATACAR
            System.out.println("eligio Atacar");

            if (Mat[x][y].equals("EV0")) {
                System.out.println("ingrese la x ");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV1")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV2")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" R ")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" S ")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" Z ")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
            }
        }

    }

    public static void JUg2(String[][] Mat) {
        System.out.println("jugador 2");

        System.out.println("ingrese la x");
        int x = lea.nextInt();
        while (x < 0 || x > 9) {
            System.out.println("numero invalido\ningrese otro");
            x = lea.nextInt();
        }
        System.out.println("ingrese la y");
        int y = lea.nextInt();
        while (y < 0 || y > 9) {
            System.out.println("numero invalido\ningrese otro");
            y = lea.nextInt();
        }
        System.out.println("que desea hacer \n1)Moverse\n2)Atacar");
        int trab = lea.nextInt();
        System.out.println("selecciono Moverse");
        if (trab == 1) {//MOVERSE
            if (Mat[x][y].equals("EV0")) {
                System.out.println("ingrese la x a la  que lo quiere mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y a la  que lo quiere mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV1")) {
                System.out.println("ingrese la x al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV2")) {
                System.out.println("ingrese la x al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y  al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" R ")) {
                System.out.println("ingrese la x  al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y al que ataca");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" S ")) {
                System.out.println("ingrese la x  al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y  al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" Z ")) {
                System.out.println("ingrese la x  al que se va a mover");
                int xn = lea.nextInt();
                while (xn < 0 || xn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    xn = lea.nextInt();
                }
                System.out.println("ingrese la y  al que se va a mover");
                int yn = lea.nextInt();
                while (yn < 0 || yn > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    yn = lea.nextInt();
                }
            }
        } else {//ATACAR
            System.out.println("eligio Atacar");

            if (Mat[x][y].equals("EV0")) {
                System.out.println("ingrese la x ");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV1")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV2")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" R ")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" S ")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" Z ")) {
                System.out.println("ingrese la x del que quiere atacar");
                int ax = lea.nextInt();
                while (ax < 0 || ax > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ax = lea.nextInt();
                }
                System.out.println("ingrese la y del que quiere atacar");
                int ay = lea.nextInt();
                while (ay < 0 || ay > 9) {
                    System.out.println("numero invalido\ningrese otro");
                    ay = lea.nextInt();
                }
            }
        }
    }
}
