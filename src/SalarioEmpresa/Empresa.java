package SalarioEmpresa;
import java.util.ArrayList;


public class Empresa {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    
    public void contratar(Empleado empleado){
        empleados.add(empleado);
    }
    
    
    public double diaDePago(){
        double sueldosTotales = 0;
        
        return sueldosTotales;
    }
}