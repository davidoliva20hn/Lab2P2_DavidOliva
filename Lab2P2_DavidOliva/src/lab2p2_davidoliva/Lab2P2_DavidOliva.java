/*
 */
package lab2p2_davidoliva;

import java.util.Scanner;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Lab2P2_DavidOliva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        Usuario Estudiante = new Usuario("David", "1234A", "Estudiante");
        int Submenu = 0;
        int menu = 0;
        int opc = 0;
        do {
            System.out.println("Menú\n"
                    + "1.	Agregar usuario\n"
                    + "2.	Submenu\n"
                    + "3.	Salir");
            System.out.println("Ingrese Una Opcion:");
            menu = lea.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("Usuario\n"
                            + "1. Estudiante\n"
                            + "2. Profesor\n"
                            + "3. Bibliotecario");
                    System.out.println("Ingrese Una Opcion:");
                    opc = lea.nextInt();

                }
                case 2 -> {
                    System.out.println("Submenu\n"
                            + "1. Listar Recursos\n"
                            + "2. Crear Recurso\n"
                            + "3. Eliminar Recurso"
                    );
                    System.out.println("Ingrese una opcion:");
                    Submenu = lea.nextInt();
                    switch (Submenu) {
                        case 1 -> {

                        }
                        case 2 -> {

                        }
                        case 3 -> {

                        }
                        case 4 -> {

                        }
                    }
                }
                case 3 -> {
                    System.exit(0);
                }

            }
        } while (menu != 5);
    }

}
