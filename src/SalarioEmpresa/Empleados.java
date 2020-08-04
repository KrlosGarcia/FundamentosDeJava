	package SalarioEmpresa;

	import java.util.Date;

	public class Empleados {

		private double salarios;
		private String Nombres;
		private String numeroIdentificacion;
		private Date fechaIngreso;
		private int codigoArea;
		private String puesto;
		public Empleados  puesto (String puesto) {
			
			this.puesto=puesto;
			return this;
		}
		
		/**
		 * @return the puesto
		 */
		public String getPuesto() {
			return puesto;
		}

		/**
		 * @param puesto the puesto to set
		 */
		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}

		public Empleados  salarios (double salarios) {
			
			this.salarios=salarios;
			return this;
		}
		public Empleados  Nombres (String Nombres) {
			 this.Nombres=Nombres;
			
			return this;
		}
		public Empleados  numeroIdentificacion (String numeroIdentificacion) {
			 this.numeroIdentificacion=numeroIdentificacion;
			return this;
		}
		public Empleados  fechaIngreso (Date fechaIngreso) {
			 this.fechaIngreso=fechaIngreso;
			return this;
		}
		public Empleados  codigoArea (int codigoArea) {
			 this.codigoArea=codigoArea;
			return this;
		}

		

		/**
		 * 
		 */
		public Empleados() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @return the salarios
		 */
		public double getSalarios() {
			return salarios;
		}

		/**
		 * @param salarios the salarios to set
		 */
		public void setSalarios(double salarios) {
			this.salarios = salarios;
		}

		/**
		 * @return the nombres
		 */
		public String getNombres() {
			return Nombres;
		}

		/**
		 * @param nombres the nombres to set
		 */
		public void setNombres(String nombres) {
			Nombres = nombres;
		}

		/**
		 * @return the numeroIdentificacion
		 */
		public String getNumeroIdentificacion() {
			return numeroIdentificacion;
		}

		/**
		 * @param numeroIdentificacion the numeroIdentificacion to set
		 */
		public void setNumeroIdentificacion(String numeroIdentificacion) {
			this.numeroIdentificacion = numeroIdentificacion;
		}

		/**
		 * @return the fechaIngreso
		 */
		public Date getFechaIngreso() {
			return fechaIngreso;
		}

		/**
		 * @param fechaIngreso the fechaIngreso to set
		 */
		public void setFechaIngreso(Date fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}

		/**
		 * @return the codigoArea
		 */
		public int getCodigoArea() {
			return codigoArea;
		}

		/**
		 * @param codigoArea the codigoArea to set
		 */
		public void setCodigoArea(int codigoArea) {
			this.codigoArea = codigoArea;
		}

	}