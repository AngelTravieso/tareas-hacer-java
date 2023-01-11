package tareas;

import java.util.*;
import constants.Constantes;

public class TareasHacer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            // Mostrar menu
            mostrarMenu();

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case Constantes.SALIR -> // Cerrar consola (salida)
                        cerrarConsola(sc);
                    case Constantes.AGREGAR -> // Agregar Tarea
                        agregarTarea();
                    case Constantes.LISTAR -> // Listar Tareas
                        listarTareas();
                    case Constantes.ACTUALIZAR -> // Actualizar Tarea
                        actualizarTarea();
                    case Constantes.ELIMINAR -> // Eliminar Tarea
                        eliminarTarea();
                    default -> // Opcion no valida
                        System.out.println("Opcion no valida");
                }

            } catch (InputMismatchException ex) {
                ex.printStackTrace(System.out);

            }

        } while (opcion < 0 || opcion > 4);

    }

    // Mostrar menu
    public static void mostrarMenu() {
        System.out.println("--- Gestion de Tareas ---\n");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Listar Tareas");
        System.out.println("3. Actualizar Tarea");
        System.out.println("4. Eliminar Tarea \n");
        System.out.println("0. Salir\n");
        System.out.print("Opcion: ");
    }

    // Cerrar la consola
    public static void cerrarConsola(Scanner sc) {
        System.out.println("\n¡Programa finalizado!");
        sc.close();

    }

    // Agregar Tarea
    public static void agregarTarea() {
        System.out.println("agregando");
    }

    // Listar Tareas
    public static void listarTareas() {
        System.out.println("listando");
    }

    // Actualizar Tarea
    public static void actualizarTarea() {
        System.out.println("actualizando");
    }

    // Eliminar Tarea
    public static void eliminarTarea() {
        System.out.println("eliminando");
    }
}
