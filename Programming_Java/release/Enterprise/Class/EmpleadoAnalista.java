package Enterprise.Class;

import java.util.Date;

/**
 * CLASS EMPLEADOANALISTA
 *
 * Entity EmpleadoAnalista that inherited of Empleado
 *
 *
 * $LastChangedRevision: 25/03/2016 $LastChangedDate: 25/03/2016
 */
public class EmpleadoAnalista extends Empleado {

	/**
	 * CONSTRUCT CLASS
	 **/
	public EmpleadoAnalista(int _identity, String _name, int _age, char _sex, int _phone, String _streetAddress,
			int _salary, String _position, Date _entryDate, Date _departureDate) {
		super(_identity, _name, _age, _sex, _phone, _streetAddress, _salary, _position, _entryDate, _departureDate);
	}

	/**
	 * Set a request for increase the salary of a employee
	 *
	 * @param value
	 *            Increase value
	 * @return void
	 */
	@Override
	public void requestSalary(int value) {
		if (value > 0) {
			int salaryFinal = this.get_salary() + value;

			this.set_salary(salaryFinal);
			System.out.println("El empleado [Analista] " + this.get_name() + " solicitó un aumento de salario por: "
					+ value + ". El salario final es: " + this.get_salary());
		}
	}

	/**
	 * Calculate the salary of employee (A discount health and orders)
	 *
	 * @return Salary value
	 */
	@Override
	public int calculateSalary() {
		return this.get_salary();
	}

	/**
	 * Get the information of employee
	 *
	 * @return Information formatted
	 */
	@Override
	public String getInformation() {
		StringBuilder builder = new StringBuilder();
		builder.append(" | Nombre: " + this.get_name());
		builder.append(" | Edad: " + this.get_age());
		builder.append(" | Sexo: " + this.get_sex());
		builder.append(" | Telefono: " + this.get_phone());
		builder.append(" | Direccion: " + this.get_streetAddress());
		builder.append(" | Salario: " + this.get_salary());

		return builder.toString();
	}
}
