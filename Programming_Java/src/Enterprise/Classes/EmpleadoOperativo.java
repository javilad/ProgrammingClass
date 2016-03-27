package Enterprise.Classes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * CLASS EMPLEADOOPERATIVO
 *
 * Entity EmpleadoOperativo that inherited of Empleado
 *
 *
 * $LastChangedRevision: 25/03/2016 $LastChangedDate: 25/03/2016
 */
public class EmpleadoOperativo extends Empleado {

	/**
	 * CONSTRUCT CLASS
	 **/
	public EmpleadoOperativo(int _identity, String _name, int _age, char _sex, int _phone, String _streetAddress,
			int _salary, String _position, Date _entryDate, Date _departureDate) {
		super(_identity, _name, _age, _sex, _phone, _streetAddress, _salary, _position, _entryDate, _departureDate);
	}

	public EmpleadoOperativo() {
	}

	/**
	 * Discount by Health's and Order's employee
	 */
	private int discountHealth = 150;
	public static Map<Integer, Integer> employeesOrder = new HashMap<Integer, Integer>();

	/**
	 * Get employees with orders
	 * 
	 * @return
	 */
	public Map<Integer, Integer> getEmployeesOrder() {
		return employeesOrder;
	}

	/**
	 * Set employee with order
	 * 
	 * @param employeeOrder
	 */
	public void setEmployeesOrder(int identity, int discountOrder) {
		employeesOrder.put(identity, discountOrder);
	}

	/**
	 * Put the employees with orders
	 */
	private void putEmployeesOrder() {
		employeesOrder.put(37378282, 1200);
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
			System.out.println("El empleado [Operativo] " + this.get_name() + " solicitó un aumento de salario por: "
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
		putEmployeesOrder();
		int order = 0;
		if (employeesOrder.get(this.get_identity()) > 0) {
			order = 200;
		}
		return this.get_salary() - (discountHealth + order);
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
