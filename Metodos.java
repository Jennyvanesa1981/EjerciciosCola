package EjerciciosCola;

import java.util.Queue;
import java.util.Scanner;

public class Metodos {

    public ObjVisitante RegistrarVisitante(Queue<ObjVisitante> visitantes, Scanner scanner) {

        System.out.print("Ingrese el ID del visitante: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la empresa: ");
        String empresa = scanner.nextLine();

        System.out.print("Ingrese el funcionario que desea visitar: ");
        String funcionario = scanner.nextLine();

        ObjVisitante visitante = new ObjVisitante(
                id, nombre, empresa, funcionario, "Esperando");

        visitantes.offer(visitante);

        return visitante;
    }

    public ObjVisitante BuscarVisitante(Queue<ObjVisitante> visitantes, int id) {

        for(ObjVisitante visitante : visitantes) {

            if(visitante.getId() == id) {
                return visitante;
            }
        }

        return null;
    }

    public ObjVisitante LlamarVisitante(Queue<ObjVisitante> visitantes, int id) {

        ObjVisitante visitante = BuscarVisitante(visitantes, id);

        if(visitante != null) {
            visitante.setEstado("Llamado");
            return visitante;
        }

        return null;
    }

    public ObjVisitante NoResponde(Queue<ObjVisitante> visitantes, int id) {

        ObjVisitante visitante = BuscarVisitante(visitantes, id);

        if(visitante != null) {
            visitante.setEstado("No Responde");
            return visitante;
        }

        return null;
    }

    public ObjVisitante CancelarVisita(Queue<ObjVisitante> visitantes, int id) {

        ObjVisitante visitante = BuscarVisitante(visitantes, id);

        if(visitante != null) {
            visitante.setEstado("Cancelado");
            return visitante;
        }

        return null;
    }

    public ObjVisitante CambiarFuncionario(
            Queue<ObjVisitante> visitantes, int id, String nuevoFuncionario) {

        ObjVisitante visitante = BuscarVisitante(visitantes, id);

        if(visitante != null) {
            visitante.setNombreFuncionario(nuevoFuncionario);
            return visitante;
        }

        return null;
    }

    public ObjVisitante AtenderVisitante(Queue<ObjVisitante> visitantes, int id) {

        ObjVisitante visitante = BuscarVisitante(visitantes, id);

        if(visitante != null) {
            visitante.setEstado("Atendido");
            return visitante;
        }

        return null;
    }

    public void MostrarVisitantes(Queue<ObjVisitante> visitantes) {

        for(ObjVisitante visitante : visitantes) {

            System.out.println("ID: " + visitante.getId());
            System.out.println("Nombre: " + visitante.getNombre());
            System.out.println("Empresa: " + visitante.getEmpresa());
            System.out.println("Funcionario: " + visitante.getNombreFuncionario());
            System.out.println("Estado: " + visitante.getEstado());
            System.out.println("--------------------------");
        }
    }
}