package Enterprise.Class;

import java.util.Date;
import Enterprise.Interfaces.IEmpleado;

/**
 * CLASS EMPLEADO
 *
 * Entity employee of Enterprise
 *
 * 
 * $LastChangedRevision: 25/03/2016 $LastChangedDate: 25/03/2016
 */
public abstract class Empleado implements IEmpleado {

	/**
	 * CONSTRUCT CLASS
	 * 
	 * @param _identity
	 * @param _name
	 * @param _age
	 * @param _sex
	 * @param _phone
	 * @param _streetAddress
	 * @param _salary
	 * @param _position
	 * @param _entryDate
	 * @param _departureDate
	 */
	public Empleado(int _identity, String _name, int _age, char _sex, int _phone, String _streetAddress, int _salary,
			String _position, Date _entryDate, Date _departureDate) {
		super();
		this._identity = _identity;
		this._name = _name;
		this._age = _age;
		this._sex = _sex;
		this._phone = _phone;
		this._streetAddress = _streetAddress;
		this._salary = _salary;
		this._position = _position;
		this._entryDate = _entryDate;
		this._departureDate = _departureDate;
	}

	public Empleado() {
	}

	/**
	 * VARIABLES CLASS
	 **/
	private int _identity;
	private String _name;
	private int _age;
	private char _sex;
	private int _phone;
	private String _streetAddress;
	private int _salary;
	private String _position;
	private Date _entryDate;
	private Date _departureDate;

	/**
	 * ABSTRACT METHODS
	 **/
	public abstract String getInformation();

	public abstract void requestSalary(int value);

	public abstract int calculateSalary();

	/**
	 * GETTERS AND SETTERS
	 **/

	/**
	 * @return the _identity
	 */
	public int get_identity() {
		return _identity;
	}

	/**
	 * @param _identity
	 *            the _identity to set
	 */
	public void set_identity(int _identity) {
		this._identity = _identity;
	}

	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * @param _name
	 *            the _name to set
	 */
	public void set_name(String _name) {
		this._name = _name;
	}

	/**
	 * @return the _age
	 */
	public int get_age() {
		return _age;
	}

	/**
	 * @param _age
	 *            the _age to set
	 */
	public void set_age(int _age) {
		this._age = _age;
	}

	/**
	 * @return the _sex
	 */
	public char get_sex() {
		return _sex;
	}

	/**
	 * @param _sex
	 *            the _sex to set
	 */
	public void set_sex(char _sex) {
		this._sex = _sex;
	}

	/**
	 * @return the _phone
	 */
	public int get_phone() {
		return _phone;
	}

	/**
	 * @param _phone
	 *            the _phone to set
	 */
	public void set_phone(int _phone) {
		this._phone = _phone;
	}

	/**
	 * @return the _streetAddress
	 */
	public String get_streetAddress() {
		return _streetAddress;
	}

	/**
	 * @param _streetAddress
	 *            the _streetAddress to set
	 */
	public void set_streetAddress(String _streetAddress) {
		this._streetAddress = _streetAddress;
	}

	/**
	 * @return the _salary
	 */
	public int get_salary() {
		return _salary;
	}

	/**
	 * @param _salary
	 *            the _salary to set
	 */
	public void set_salary(int _salary) {
		this._salary = _salary;
	}

	/**
	 * @return the _position
	 */
	public String get_position() {
		return _position;
	}

	/**
	 * @param _position
	 *            the _position to set
	 */
	public void set_position(String _position) {
		this._position = _position;
	}

	/**
	 * @return the _entryDate
	 */
	public Date get_entryDate() {
		return _entryDate;
	}

	/**
	 * @param _entryDate
	 *            the _entryDate to set
	 */
	public void set_entryDate(Date _entryDate) {
		this._entryDate = _entryDate;
	}

	/**
	 * @return the _departureDate
	 */
	public Date get_departureDate() {
		return _departureDate;
	}

	/**
	 * @param _departureDate
	 *            the _departureDate to set
	 */
	public void set_departureDate(Date _departureDate) {
		this._departureDate = _departureDate;
	}
}