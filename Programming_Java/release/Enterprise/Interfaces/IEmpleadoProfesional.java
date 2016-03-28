package Enterprise.Interfaces;

import java.util.Date;

public interface IEmpleadoProfesional {
	
	int discountSalary = 100000;
	boolean markEntry(Date dateEntry);	
	boolean markOut(Date dateOut); 
}
