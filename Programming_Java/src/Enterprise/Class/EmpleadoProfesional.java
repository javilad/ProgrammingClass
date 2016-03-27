package Enterprise.Class;

import java.util.Date;
import Enterprise.Interfaces.IEmpleadoProfesional;

/**
 * CLASS EMPLEADOPROFESIONAL
 *
 * Entity EmpleadoProfesional that inherited of Empleado
 *
 *
 * $LastChangedRevision: 25/03/2016 $LastChangedDate: 25/03/2016
 */
public class EmpleadoProfesional extends Empleado implements IEmpleadoProfesional {

	/**
	 * VARIABLES CLASS
	 **/
	private static String _career;
	private static String _university;
	private static Date _dateGrade;

	/**
	 * CONSTRUCT CLASS
	 **/
	public EmpleadoProfesional(int _identity, String _name, int _age, char _sex, int _phone, String _streetAddress,
			int _salary, String _position, Date _entryDate, Date _departureDate) {
		super(_identity, _name, _age, _sex, _phone, _streetAddress, _salary, _position, _entryDate, _departureDate);
	}

	public EmpleadoProfesional(int _identity, String _name, int _age, char _sex, int _phone, String _streetAddress,
			int _salary, String _position, Date _entryDate, Date _departureDate, String career, String university,
			Date dateGrade) {
		super(_identity, _name, _age, _sex, _phone, _streetAddress, _salary, _position, _entryDate, _departureDate);
		_career = career;
		_university = university;
		_dateGrade = dateGrade;
	}

	public EmpleadoProfesional() {
	}

	/**
	 * @return the _career
	 */
	public static String get_career() {
		return _career;
	}

	/**
	 * @param _career
	 *            the _career to set
	 */
	public static void set_career(String _career) {
		EmpleadoProfesional._career = _career;
	}

	/**
	 * @return the _university
	 */
	public static String get_university() {
		return _university;
	}

	/**
	 * @param _university
	 *            the _university to set
	 */
	public static void set_university(String _university) {
		EmpleadoProfesional._university = _university;
	}

	/**
	 * @return the _dateGrade
	 */
	public static Date get_dateGrade() {
		return _dateGrade;
	}

	/**
	 * @param _dateGrade
	 *            the _dateGrade to set
	 */
	public static void set_dateGrade(Date _dateGrade) {
		EmpleadoProfesional._dateGrade = _dateGrade;
	}

	/**
	 * Mark the date when the employee entries
	 *
	 * @param dateEntry
	 *            The date of entry
	 * @return Result of the operation
	 */
	public boolean markEntry(Date dateEntry) {
		boolean _result = false;
		if (dateEntry != null) {
			_result = false;
			System.out.println("El empleado [Profesional]" + this.get_name() + " marco su entrada: " + dateEntry);
		}

		return _result;
	}

	/**
	 * Mark the sale date of employee
	 *
	 * @param dateEntry
	 *            The date of out
	 * @return Result of the operation
	 */
	public boolean markOut(Date dateOut) {
		boolean _result = false;
		if (dateOut != null) {
			_result = false;
			System.out.println("El empleado [Profesional]" + this.get_name() + " marco su salida: " + dateOut);
		}

		return _result;
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
			System.out.println("El empleado [Profesional] " + this.get_name() + " solicitó un aumento de salario por: "
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
		return this.get_salary() - IEmpleadoProfesional.discountSalary;
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