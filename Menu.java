package EjerciciosCola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<ObjVisitante> visitantes = new LinkedList<>();
        Metodos metodos = new Metodos();

        int opcion;

        do {

            System.out.println("\n--- RECEPCION EMPRESARIAL ---");
            System.out.println("1. Registrar visitante");
            System.out.println("2. Mostrar visitantes");
            System.out.println("3. Llamar visitante");
            System.out.println("4. Visitante no responde");
            System.out.println("5. Cancelar visita");
            System.out.println("6. Cambiar funcionario");
            System.out.println("7. Atender visitante");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    metodos.RegistrarVisitante(visitantes, scanner);
                    System.out.println("Visitante registrado con estado: Esperando");
                    break;

                case 2:

                    metodos.MostrarVisitantes(visitantes);
                    break;

                case 3:

                    System.out.print("Ingrese el ID del visitante: ");
                    int idLlamar = scanner.nextInt();

                    ObjVisitante llamado = metodos.LlamarVisitante(visitantes, idLlamar);

                    if (llamado != null) {
                        System.out.println("Visitante llamado correctamente.");
                    } else {
                        System.out.println("No se encontro el visitante.");
                    }
                    break;

                case 4:

                    System.out.print("Ingrese el ID del visitante: ");
                    int idNoResponde = scanner.nextInt();

                    ObjVisitante noResponde = metodos.NoResponde(visitantes, idNoResponde);

                    if (noResponde != null) {
                        System.out.println("El visitante quedo como: No Responde");
                    } else {
                        System.out.println("No se encontro el visitante.");
                    }
                    break;

                case 5:

                    System.out.print("Ingrese el ID del visitante: ");
                    int idCancelar = scanner.nextInt();

                    ObjVisitante cancelado = metodos.CancelarVisita(visitantes, idCancelar);

                    if (cancelado != null) {
                        System.out.println("La visita fue cancelada.");
                    } else {
                        System.out.println("No se encontro el visitante.");
                    }
                    break;

                case 6:

                    System.out.print("Ingrese el ID del visitante: ");
                    int idFuncionario = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nuevo funcionario: ");
                    String nuevoFuncionario = scanner.nextLine();

                    ObjVisitante cambiado = metodos.CambiarFuncionario(
                            visitantes, idFuncionario, nuevoFuncionario);

                    if (cambiado != null) {
                        System.out.println("Funcionario cambiado correctamente.");
                    } else {
                        System.out.println("No se encontro el visitante.");
                    }
                    break;

                case 7:

                    System.out.print("Ingrese el ID del visitante: ");
                    int idAtender = scanner.nextInt();

                    ObjVisitante atendido = metodos.AtenderVisitante(visitantes, idAtender);

                    if (atendido != null) {
                        System.out.println("Visitante atendido correctamente.");
                    } else {
                        System.out.println("No se encontro el visitante.");
                    }
                    break;

                case 8:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
}