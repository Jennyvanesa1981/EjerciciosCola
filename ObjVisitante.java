package EjerciciosCola;

public class ObjVisitante {

    private int Id;
    private String Nombre;
    private String Empresa;
    private String NombreFuncionario;
    private String Estado;

    public ObjVisitante(int id, String nombre, String empresa, String nombreFuncionario, String estado) {
        Id = id;
        Nombre = nombre;
        Empresa = empresa;
        NombreFuncionario = nombreFuncionario;
        Estado = estado;
    }

    public ObjVisitante() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getNombreFuncionario() {
        return NombreFuncionario;
    }

    public void setNombreFuncionario(String nombreFuncionario) {
        NombreFuncionario = nombreFuncionario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
    
    
}
