package PreOrganized;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class EmployeeAttendanceManager {
	
	private Shift currentShift;
	
	
	public void startShift(Employee employee) {
		Shift shift = new Shift();
		shift.setShiftStart(LocalTime.now());
		currentShift = shift;
		employee.getShiftList().add(shift);
	}
	//public void 
}
