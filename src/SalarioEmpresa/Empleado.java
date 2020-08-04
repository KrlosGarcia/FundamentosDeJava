	package SalarioEmpresa;

public class Empleado {
    protected double salario;
    protected String nombresYapellidos;
    protected double cedula;

    public Empleado(String nombresYapellidos, double cedula) {
        //this.salario = salario;
        this.nombresYapellidos = nombresYapellidos;
        this.cedula = cedula;
    }
    
    public Empleado(double salario){
        this.salario = salario;
    }

    
    public void setNombresYapellidos(String nombresYapellidos) {
        this.nombresYapellidos = nombresYapellidos;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombresYapellidos() {
        return nombresYapellidos;
    }

    public double getCedula() {
        return cedula;
    }

    
    
    
}