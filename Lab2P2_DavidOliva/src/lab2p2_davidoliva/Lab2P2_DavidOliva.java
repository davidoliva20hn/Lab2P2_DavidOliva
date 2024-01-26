/*
 */
package lab2p2_davidoliva;

import java.util.ArrayList;
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
       ArrayList ListaBiblioteca = new ArrayList();
        Scanner leer = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        int Submenu = 0;
        int menu = 0;
        int opc = 0;
        int TipoRecurso=0;
        do {
            System.out.println("Menú\n"
                    + "1. Agregar usuario\n"
                    + "2. Submenu\n"
                    + "3. Salir");
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
                    switch (opc) {
                        case 1 -> {
                            Usuario usuario = new Usuario("David", "1234A", "Estudiante");
                        }
                        case 2 -> {
                            Usuario usuario = new Usuario("Andres", "1234E", "Profesor");
                        }
                        case 3 -> {
                            Usuario usuario = new Usuario("Victoria", "1234W", "Bibliotecario");
                        }
                    }

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
                            System.out.println("1. Libros\n"
                                    + "2. Artículos\n"
                                    + "3. Cursos en Linea\n"
                                    + "4. Conferencias Virtuales");
                            System.out.println("Ingrese opcion:");
                            TipoRecurso = lea.nextInt();
                            switch (TipoRecurso) {
                                case 1 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo=leer.nextLine();
                                    System.out.println("Ingrese el autor:");
                                    String autor=leer.nextLine();
                                    System.out.println("Ingrese el genero:");
                                    String genero=leer.nextLine();
                                    System.out.println("Ingrese el año de publicasion:");
                                    String año=leer.nextLine();
                                    String disponibi="si";
                                }
                                case 2->{
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el autor:");
                                    String autor = leer.nextLine();
                                    System.out.println("Ingrese el tema:");
                                    String tame = leer.nextLine();
                                    System.out.println("Ingrese el año de publicasion:");
                                    String año = leer.nextLine();
                                    String disponibi = "si";
                                }
                                case 3->{
                                    
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el instructor:");
                                    String instructor= leer.nextLine();
                                    System.out.println("Ingrese la Duracion:");
                                    String Duracion = leer.nextLine();
                                    System.out.println("Ingrese la Plataforma:");
                                    String Plataforma = leer.nextLine();
                                    String disponibi = "si";
                                }
                            }

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
