package SalarioEmpresa;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		List<Empleados> lstEmpleados = new ArrayList<>();
		int contador = 0;
		double gastosEmpresa = 0;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		lstEmpleados.add(new Empleados().salarios(100).Nombres("oeti").puesto("gerente")
				.numeroIdentificacion("095467983").codigoArea(12).fechaIngreso(new Date("11/11/2019")));
		lstEmpleados.add(new Empleados().salarios(1000).Nombres("oeti").puesto("oficinista")
				.numeroIdentificacion("095467983").codigoArea(12).fechaIngreso(format.parse("12/01/2019")));
		lstEmpleados.add(new Empleados().salarios(364).Nombres("oeti").puesto("supervisores")
				.numeroIdentificacion("095467983").codigoArea(12).fechaIngreso(new Date("11/11/2019")));

		while (contador < lstEmpleados.size()) {
			if (lstEmpleados.get(contador).getPuesto() == "gerente")
				gastosEmpresa += lstEmpleados.get(contador).getSalarios() + Gerentes.bono;

			if (lstEmpleados.get(contador).getPuesto() == "oficinista")
				gastosEmpresa += lstEmpleados.get(contador).getSalarios();

			if (lstEmpleados.get(contador).getPuesto() == "supervisores") {
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				LocalDate fechas = LocalDate.parse("10/12/2018", fmt);
				int anios = CalculoAnioTrabajado(fechas);

				if (anios > 1)
					gastosEmpresa += lstEmpleados.get(contador).getSalarios()
							+ (SupervisoresTecnicos.porcentajeExtra * anios);
				else
					gastosEmpresa += lstEmpleados.get(contador).getSalarios();
			}

			contador++;
		}

		System.out.println(gastosEmpresa);

	}

	private void calculoPorGerente() {

	}

	private void calculoPorSupervisorTecnico(Date fechaIngreso) {

	}

	private static int CalculoAnioTrabajado(LocalDate fechas) {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechas, ahora);

		return periodo.getYears();

	}
}