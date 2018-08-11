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
    static int jug1 = 8;
    static int jug2 = 8;
    static int eva0 = 5;
    static int eva1 = 5;
    static int eva2 = 5;
    static int pm = 5;
    static int R = 5;
    static int Z = 5;
    static int S = 5;

    static Scanner lea = new Scanner(System.in);
    static Ancestral An;

    public static void main(String[] args) {
        // TODO code application logic here
//CRUD ( CREATE , READ , UPDATE ,DELETE ) 
        int salir = 0;
        ArrayList p = new ArrayList();
        ArrayList<Angel> A = new ArrayList();
        ArrayList<Evas> e = new ArrayList();
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
                    //private String color;private int produccion;private int altura;private String alma;
                    //private int ojos;private String pais;private Piloto piloto;private int codigo;private int dano;
                    Evas eva_00 = new Evas("azul", 12000, 2, "Braulio", 2, "Honduras", new Piloto(), 123, 900);
                    Evas eva_01 = new Evas("morado", 9000, 3, "josue", 3, "portugal", new Piloto(), 99, 888);
                    Evas eva_02 = new Evas("rojo", 9200, 3, "alexy", 4, "holanda", new Piloto(), 88, 950);
                    Evas eva_pm = new Evas("amarillo", 8400, 2, "david", 2, "Honduras", new Piloto(), 99, 925);
                    e.add(eva_pm);
                    e.add(eva_00);
                    e.add(eva_01);
                    e.add(eva_02);
                    for (Evas j : e) {
                        System.out.println(j);
                    }
                    break;
                case 2:
                    //String color, String descripcion, String sangre, int fecha, String nombre, String volar, int potencia
                    Angel Ramiel = new Angel("blanco", "especial", "azul", 13, "ramiel", "no", 90);
                    Angel sachile = new Angel("amarillo", "singular", "rojo", 28, "sachiel", "no", 88);
                    Angel Zeruel = new Angel("morado", "especial", "morado", 21, "zeruel", "si", 91);
                    A.add(Ramiel);
                    A.add(sachile);
                    A.add(Zeruel);
                    for (Angel j : A) {
                        System.out.println(j);
                    }
                    break;
                case 3://CRUD ( CREATE , READ , UPDATE ,DELETE )

                    System.out.println("ingrese que quiere hacer:"
                            + "\n1)crear un piloto"
                            + "\n2)listar pilotos"
                            + "\n3)modificar un piloto"
                            + "\n4)borrar un piloto"
                            + "\n5)regresar");
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
                                    String NEscuela = lea.nextLine();
                                    ((Piloto) p.get(Opc)).setEscuela(NEscuela);
                                    break;
                                case 6:
                                    System.out.println("ingrese sincroizacion");
                                    int NSincro = lea.nextInt();
                                    ((Piloto) p.get(Opc)).setSincronizacion(NSincro);
                                    break;
                                case 7:
                                    System.out.println("ingrese eva asignada");
                                    String Neva = lea.nextLine();
                                    ((Piloto) p.get(Opc)).setEva(Neva);
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
                            if (jug2 == 0) {
                                vivo = false;
                            }
                            imprimat(Mat);
                        } else if (turno == 2) {
                            JUg2(Mat);
                            turno--;
                            //ingresar metodos
                            if (jug1 == 0) {
                                vivo = false;
                            }
                            imprimat(Mat);
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
            if (Mat[x][y].equals(" R ")) {
                An = new Ramiel();
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
                boolean cosa = validarposi(xn, yn, Mat);

                if (cosa == true) {

                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[xn][yn] = " R ";
                        Mat[x][y] = "   ";
                    }
                }

                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" S ")) {
                An = new Sachiel();
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
                boolean cosa = validarposi(xn, yn, Mat);
                if (cosa == true) {

                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[xn][yn] = " S ";
                        Mat[x][y] = "   ";
                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" Z ")) {
                An = new Zeruel();
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
                boolean cosa = validarposi(xn, yn, Mat);
                if (cosa == true) {

                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[xn][yn] = " Z ";
                        Mat[x][y] = "   ";
                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            }
        } else {//ATACAR
            System.out.println("eligio Atacar");

            if (Mat[x][y].equals(" R ")) {
                An = new Ramiel();
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
                //static int eva0 = 5;
                //static int eva1 = 5;
                //static int eva2 = 5;
                //static int pm = 5;
                //static int R = 5;
                //static int Z = 5;
                //static int S = 5;
                boolean atak = An.atacar(x, y, ax, ay);
                if (atak == true) {
                    if (Mat[ax][ay].contains(" PM")) {
                        pm--;

                    }
                    if (Mat[ax][ay].contains("EV0")) {
                        eva0--;
                    }
                    if (Mat[ax][ay].contains("EV1")) {
                        eva1--;
                    }
                    if (Mat[ax][ay].contains("EV2")) {
                        eva2--;
                    }
                    if (pm == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (eva0 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                    if (eva1 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                    if (eva2 == 0) {
                        Mat[ax][ay] = "   ";

                    }
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
                boolean atak = An.atacar(x, y, ax, ay);
                if (atak == true) {
                    if (Mat[ax][ay].contains(" PM")) {
                        pm--;

                    }
                    if (Mat[ax][ay].contains("EV0")) {
                        eva0--;
                    }
                    if (Mat[ax][ay].contains("EV1")) {
                        eva1--;
                    }
                    if (Mat[ax][ay].contains("EV2")) {
                        eva2--;
                    }
                    if (pm == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (eva0 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                    if (eva1 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                    if (eva2 == 0) {
                        Mat[ax][ay] = "   ";

                    }
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
                boolean atak = An.atacar(x, y, ax, ay);
                if (atak == true) {
                    if (Mat[ax][ay].contains(" PM")) {
                        pm--;

                    }
                    if (Mat[ax][ay].contains("EV0")) {
                        eva0--;
                    }
                    if (Mat[ax][ay].contains("EV1")) {
                        eva1--;
                    }
                    if (Mat[ax][ay].contains("EV2")) {
                        eva2--;
                    }
                    if (pm == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (eva0 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                    if (eva1 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                    if (eva2 == 0) {
                        Mat[ax][ay] = "   ";

                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
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
                An = new EVA_00();
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
                boolean cosa = validarposi(xn, yn, Mat);

                if (cosa == true) {
                    Mat[x][y] = "   ";
                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[xn][yn] = "EV0";
                    }
                }

                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV1")) {
                An = new EVA_01();
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
                boolean cosa = validarposi(xn, yn, Mat);
                if (cosa == true) {
                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[x][y] = "   ";
                        Mat[xn][yn] = "EV1";
                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals("EV2")) {
                An = new EVA_02();
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
                boolean cosa = validarposi(xn, yn, Mat);
                if (cosa == true) {
                    Mat[x][y] = "   ";
                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[xn][yn] = "EV2";
                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" PM")) {
                An = new Ramiel();
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
                boolean cosa = validarposi(xn, yn, Mat);
                if (cosa == true) {

                    boolean puede = An.moverse(x, y, xn, yn);
                    if (puede == true) {
                        Mat[x][y] = "   ";
                        Mat[xn][yn] = " PM";
                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
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
                boolean atak = An.atacar(x, y, ax, ay);
                if (atak == true) {
                    if (Mat[ax][ay].contains(" R ")) {
                        R--;

                    }
                    if (Mat[ax][ay].contains(" S ")) {
                        S--;
                    }
                    if (Mat[ax][ay].contains(" Z ")) {
                        Z--;
                    }
                    if (R == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (S == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (Z == 0) {
                        Mat[ax][ay] = "   ";
                    }
                }
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
                boolean atak = An.atacar(x, y, ax, ay);
                if (atak == true) {
                    if (Mat[ax][ay].contains(" R ")) {
                        R--;

                    }
                    if (Mat[ax][ay].contains(" S ")) {
                        S--;
                    }
                    if (Mat[ax][ay].contains(" Z ")) {
                        Z--;
                    }
                    if (R == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (S == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (Z == 0) {
                        Mat[ax][ay] = "   ";
                    }
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
                boolean atak = An.atacar(x, y, ax, ay);
                if (atak == true) {
                    if (Mat[ax][ay].contains(" R ")) {
                        R--;

                    }
                    if (Mat[ax][ay].contains(" S ")) {
                        S--;
                    }
                    if (Mat[ax][ay].contains(" Z ")) {
                        Z--;
                    }
                    if (R == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (S == 0) {
                        Mat[ax][ay] = "   ";
                    }
                    if (Z == 0) {
                        Mat[ax][ay] = "   ";
                    }
                }
                //poner metodo
                //poner metodo
                //poner metodo
                //poner metodo
            } else if (Mat[x][y].equals(" PM")) {
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
            }
        }
    }

    public static boolean validarposi(int x, int y, String[][] Mat) {
        boolean valida = false;
        if (Mat[x][y].equals("   ")) {
            valida = true;
        }
        return valida;
    }
}
