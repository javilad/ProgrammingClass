package Enterprise.Class;

import java.util.Date;

/**
 * CLASS EMPLEADOOUTSOURCING
 *
 * Entity EmpleadoOutSourcing that inherited of EmpleadoProfesional
 *
 *
 * $LastChangedRevision: 25/03/2016 $LastChangedDate: 25/03/2016
 */
public class EmpleadoOutSourcing extends EmpleadoProfesional {

	/**
	 * CONSTRUCT CLASS
	 **/
	public EmpleadoOutSourcing(int _identity, String _name, int _age, char _sex, int _phone, String _streetAddress,
			int _salary, String _position, Date _entryDate, Date _departureDate) {
		super(_identity, _name, _age, _sex, _phone, _streetAddress, _salary, _position, _entryDate, _departureDate);
	}

	/**
	 * Mark the date when the employee entries
	 *
	 * @param dateEntry
	 *            The date of entry
	 * @return Result of the operation
	 */
	@Override
	public boolean markEntry(Date dateEntry) {
		boolean _result = false;
		if (dateEntry != null) {
			_result = false;
			discountEntryLater(dateEntry);
			System.out.println("El empleado [OutSourcing]" + this.get_name() + " marco su entrada: " + dateEntry);
		}

		return _result;
	}

	/**
	 * @param dateEntry
	 */
	private void discountEntryLater(Date dateEntry) {
		int hourEntry = dateEntry.getHours();
		if (hourEntry >= 8) {
			this.set_salary(this.get_salary() - 5);
		}
	}

	/**
	 * Mark the sale date of employee
	 *
	 * @param dateEntry
	 *            The date of out
	 * @return Result of the operation
	 */
	@Override
	public boolean markOut(Date dateOut) {
		boolean _result = false;
		if (dateOut != null) {
			_result = false;
			System.out.println("El empleado [OutSourcing]" + this.get_name() + " marco su salida: " + dateOut);
		}

		return _result;
	}
}
