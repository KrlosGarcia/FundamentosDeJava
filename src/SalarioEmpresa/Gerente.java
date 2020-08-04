package SalarioEmpresa;

public class Gerente extends Empleado{

    public Gerente(String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
    }

    public Gerente(double salario) {
        super(salario);
    }

    public double salarioGerente(double viaticosPersonales, int anios){
        double adicional;
        if(anios  == 0){
            return salario;
        }
        else{
            adicional = salario * 0.05;
            salario +=adicional+viaticosPersonales;
            return salario;
        }
        
    }
    
}