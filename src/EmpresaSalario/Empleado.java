package EmpresaSalario;

public class Empleado {
	
	
	private String identificacion;
	private double salario;
	
	
	public Empleado(String identificacion, double salario) {
		super();
		this.identificacion = identificacion;
		this.salario = salario;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	
}
