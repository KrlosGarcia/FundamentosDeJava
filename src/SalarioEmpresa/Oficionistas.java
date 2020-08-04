package SalarioEmpresa;

public class Oficionistas extends Empleado{
    private int numeroDeIdentificacion;
    private int codigoArea;

    public Oficionistas(int numeroDeIdentificacion, int codigoArea, String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.codigoArea = codigoArea;
    }

    public Oficionistas(double salario) {
        super(salario);
        //this.numeroDeIdentificacion = numeroDeIdentificacion;
        //this.codigoArea = codigoArea;
    }
    
    //salario = sueldo basico
    public double salarioOficionista(){
        return salario;
    }
}