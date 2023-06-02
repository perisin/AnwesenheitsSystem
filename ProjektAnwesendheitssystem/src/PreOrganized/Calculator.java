package PreOrganized;

import java.time.temporal.ChronoUnit;

public class Calculator {
	
	
	public long berechneDauerInMinuten(Shift shift) {
        long dauerInSekunden = shift.getShiftStart().until(shift.getShiftEnd(), ChronoUnit.SECONDS);
        long dauerInMinuten = dauerInSekunden / 60;

        return dauerInMinuten;
    }


}
