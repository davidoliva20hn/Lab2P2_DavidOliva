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
        ArrayList usuarios = new ArrayList();
        Scanner leer = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        int Submenu = 0;
        int menu = 0;
        int opc = 0;
        int TipoRecurso = 0;
        do {
            System.out.println("""
                               Menu
                               1. Agregar usuario
                               2. Biblioteca
                               3. Salir""");
            System.out.println("Ingrese Una Opcion:");
            menu = lea.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("""
                                       Usuario
                                       1. Estudiante
                                       2. Profesor
                                       3. Bibliotecario""");
                    System.out.println("Ingrese Una Opcion:");
                    opc = lea.nextInt();
                    switch (opc) {
                        case 1 -> {
                            usuarios.add(new Usuario("David", "1234A", "Estudiante"));
                        }
                        case 2 -> {
                            usuarios.add(new Usuario("Andres", "1234E", "Profesor"));
                        }
                        case 3 -> {
                            usuarios.add(new Usuario("Victoria", "1234W", "Bibliotecario"));
                        }
                    }

                }
                case 2 -> {
                    System.out.println("""
                                       Tipo de usuario
                                       1. Estudiante 
                                       2. Profesor
                                       3. Bibliotecario""");
                    System.out.println("eleija el tipo de usuario:");
                    int tipousuari = lea.nextInt();
                    System.out.println("""
                                       Submenu
                                       1. Listar Recursos
                                       2. Crear Recurso
                                       3. Eliminar Recurso
                                       4. Modificar recurso""");
                    System.out.println("Ingrese una opcion:");
                    Submenu = lea.nextInt();
                    if (Submenu == 2 && tipousuari == 0) {
                        System.out.println("lo sentimos su tipo de usuari no es valido para esta opcion");
                        break;
                    } else if (Submenu == 3 && tipousuari == 0) {
                        System.out.println("lo sentimos su tipo de usuari no es valido para esta opcion");
                        break;
                    } else if (Submenu == 3 && tipousuari == 1) {
                        System.out.println("lo sentimos su tipo de usuari no es valido para esta opcion");
                        break;
                    }
                    if (Submenu == 4 && tipousuari == 0) {
                        System.out.println("lo sentimos su tipo de usuari no es valido para esta opcion");
                        break;
                    }
                    if (Submenu == 4 && tipousuari == 1) {
                        System.out.println("lo sentimos su tipo de usuari no es valido para esta opcion");
                        break;
                    }
                    switch (Submenu) {
                        case 1 -> {
                            String Listar = "";
                            for (int i = 0; i < ListaBiblioteca.size(); i++) {
                                Listar += i + ". " + ListaBiblioteca.get(i) + "\n";
                            }
                            System.out.println(Listar);
                        }
                        case 2 -> {
                            System.out.println("""
                                               1. Libros
                                               2. Articulos
                                               3. Cursos en Linea
                                               4. Conferencias Virtuales""");
                            System.out.println("Ingrese opcion:");
                            TipoRecurso = lea.nextInt();
                            switch (TipoRecurso) {
                                case 1 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el autor:");
                                    String autor = leer.nextLine();
                                    System.out.println("Ingrese el genero:");
                                    String genero = leer.nextLine();
                                    System.out.println("Ingrese el año de publicasion:");
                                    String año = leer.nextLine();
                                    String disponibi = "si";
                                    ListaBiblioteca.add(new Libros(titulo, autor, genero,
                                            año, disponibi));
                                }
                                case 2 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el autor:");
                                    String autor = leer.nextLine();
                                    System.out.println("Ingrese el tema:");
                                    String tema = leer.nextLine();
                                    System.out.println("Ingrese el año de publicasion:");
                                    String año = leer.nextLine();
                                    String disponibi = "si";
                                    ListaBiblioteca.add(new Articulos(titulo, autor, tema,
                                            año, disponibi));
                                }
                                case 3 -> {

                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el instructor:");
                                    String instructor = leer.nextLine();
                                    System.out.println("Ingrese la Duracion:");
                                    String Duracion = leer.nextLine();
                                    System.out.println("Ingrese la Plataforma:");
                                    String Plataforma = leer.nextLine();
                                    ListaBiblioteca.add(new CursosLinea(titulo, instructor,
                                            Duracion, Plataforma));
                                }
                                case 4 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el Conferencista:");
                                    String Conferencista = leer.nextLine();
                                    System.out.println("Ingrese la fecha:");
                                    String FechaConfe = leer.nextLine();
                                    System.out.println("Ingrese la Duracion:");
                                    String Duracion = leer.nextLine();
                                    System.out.println("Ingrese la Enlace Acceso:");
                                    String EnlaceAcceso = leer.nextLine();
                                    ListaBiblioteca.add(new ConferenciasVirtuales(titulo, Conferencista, FechaConfe,
                                            Duracion, EnlaceAcceso));
                                }

                            }//fin TipoRecurso
                        }
                        case 3 -> {
                            System.out.println("Ingrse la posicion a eliminar :");
                            int posicioneliminar = lea.nextInt();
                            ListaBiblioteca.remove(posicioneliminar);
                        }
                        case 4 -> {
                            System.out.println("Ingrse la posicion a modificar:");
                            int posicionmodif = lea.nextInt();
                            System.out.println("""
                                               1. Libros
                                               2. Articulos
                                               3. Cursos en Linea
                                               4. Conferencias Virtuales""");
                            System.out.println("Ingrese la operacion:");
                            TipoRecurso = lea.nextInt();
                            switch (TipoRecurso) {
                                case 1 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el autor:");
                                    String autor = leer.nextLine();
                                    System.out.println("Ingrese el genero:");
                                    String genero = leer.nextLine();
                                    System.out.println("Ingrese el año de publicasion:");
                                    String año = leer.nextLine();
                                    String disponibi = "si";
                                    ListaBiblioteca.set(posicionmodif, new Libros(titulo, autor, genero,
                                            año, disponibi));
                                }
                                case 2 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el autor:");
                                    String autor = leer.nextLine();
                                    System.out.println("Ingrese el tema:");
                                    String tema = leer.nextLine();
                                    System.out.println("Ingrese el año de publicasion:");
                                    String año = leer.nextLine();
                                    String disponibi = "si";
                                    ListaBiblioteca.set(posicionmodif, new Articulos(titulo, autor, tema,
                                            año, disponibi));
                                }
                                case 3 -> {

                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el instructor:");
                                    String instructor = leer.nextLine();
                                    System.out.println("Ingrese la Duracion:");
                                    String Duracion = leer.nextLine();
                                    System.out.println("Ingrese la Plataforma:");
                                    String Plataforma = leer.nextLine();
                                    ListaBiblioteca.set(posicionmodif, new CursosLinea(titulo, instructor,
                                            Duracion, Plataforma));
                                }
                                case 4 -> {
                                    System.out.println("Ingrese un titulo:");
                                    String titulo = leer.nextLine();
                                    System.out.println("Ingrese el Conferencista:");
                                    String Conferencista = leer.nextLine();
                                    System.out.println("Ingrese la fecha:");
                                    String FechaConfe = leer.nextLine();
                                    System.out.println("Ingrese la Duracion:");
                                    String Duracion = leer.nextLine();
                                    System.out.println("Ingrese la Enlace Acceso:");
                                    String EnlaceAcceso = leer.nextLine();
                                    ListaBiblioteca.set(posicionmodif, new ConferenciasVirtuales(titulo, Conferencista, FechaConfe,
                                            Duracion, EnlaceAcceso));
                                }

                            }//fin TipoRecurso
                        }
                    }//fin submenu
                }
                case 3 -> {
                    System.exit(0);
                }

            } // fin menu
        } while (menu != 5);
    }

}
