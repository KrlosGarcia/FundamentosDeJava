package EmpresaSalario;

public class Gerente extends SupervisorTecnico {
	
	private double viaticos;
	
	public Gerente(String identificacion, double salario, int aniosTrabajados, double viaticos) {
		super(identificacion, salario, aniosTrabajados);
		this.viaticos = viaticos;
	}
	
	public double getSalario() {
		return super.getSalario() + viaticos;
	}

}
