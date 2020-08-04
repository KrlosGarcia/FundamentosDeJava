package SalarioEmpresa;

import java.util.ArrayList;


public class Empresa {
private ArrayList<Empleados> empleados = new ArrayList<Empleados>();

public void contratar(Empleados empleado){
    empleados.add(empleado);
}


public double diaDePago(){
    double sueldosTotales = 0;
    
    return 0;
}
}