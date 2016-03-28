package Enterprise.Main;

import java.util.Date;

import Enterprise.Class.Empleado;
import Enterprise.Class.EmpleadoOperativo;
import Enterprise.Class.EmpleadoOutSourcing;
import Enterprise.Class.EmpleadoProfesional;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Empleado marioGutierrez = new EmpleadoOutSourcing(2321939, "Carlos Mario Gutierrez", 24, 'M', 4568900,
				"Calle falsa 456", 3000000, "Tecnico TI", new Date(), new Date());
		Empleado germanCifuentes = new EmpleadoOperativo(37378282, "German Cifuentes", 34, 'M', 3829898,
				"Calle falsa 789", 7500000, "Maestro Especializacion", new Date(), new Date());
		Empleado juanMartinez = new EmpleadoProfesional(1022966500, "Juan Fernando Martinez", 30, 'M', 7563000,
				"Calle falsa 123", 4000000, "Profesional de BI", new Date(), new Date(), "Ingeniero de Sistemas",
				"Universidad Libre", new Date());

		/**
		 * Employees that request increase your salary
		 */
		marioGutierrez.requestSalary(200000);
		germanCifuentes.requestSalary(1300);
		juanMartinez.requestSalary(6000);

		/**
		 * Calculation of salary
		 */
		System.out.println(
				"El salario del empleado: " + germanCifuentes.get_name() + " es: " + germanCifuentes.calculateSalary());

		System.out.println(
				"El salario del empleado: " + juanMartinez.get_name() + " es: " + juanMartinez.calculateSalary());

		/**
		 * Mark entries and outs of employees
		 */
		EmpleadoProfesional javierLadino = new EmpleadoProfesional(1022966500, "Javier Orlando Ladino", 24, 'M',
				4817776, "Calle falsa 901", 3000000, "Ingeniero de Desarrollo", new Date(), new Date(),
				"Ingeniero de Sistemas", "Universidad Libre", new Date());

		boolean markEntry = javierLadino.markEntry(new Date("25/03/2016 08:10:00"));
		boolean markOut = javierLadino.markOut(new Date("25/03/2016 17:00:00"));

		/**
		 * Get information of employees
		 */
		System.out.println(marioGutierrez.getInformation());
		System.out.println(germanCifuentes.getInformation());
		System.out.println(javierLadino.getInformation());
	}

}
