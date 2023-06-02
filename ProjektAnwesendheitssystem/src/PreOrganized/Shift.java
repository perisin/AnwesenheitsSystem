package PreOrganized;

import java.time.*;
import java.util.*;

public class Shift {
	private TimeSpan shift;
	private List<TimeSpan> breaks;
	
	
	private int employeeID;
	public Shift() {
		shift = new TimeSpan();
		breaks = new ArrayList<TimeSpan>();
	}
	
	public int getEmpleyeeID() {
		return employeeID;
	}

	public TimeSpan getShift() {
		return shift;
	}

	public void setShift(TimeSpan shift) {
		this.shift = shift;
	}

	public List<TimeSpan> getBreaks() {
		return breaks;
	}

	public void setBreaks(List<TimeSpan> breaks) {
		this.breaks = breaks;
	}
	
	
	
	
	
	
}
