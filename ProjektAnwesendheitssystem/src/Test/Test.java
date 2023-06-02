package Test;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test {
    private LocalTime startShift;
    private LocalTime endShift;

    public Test(LocalTime startShift, LocalTime endShift) {
        this.startShift = startShift;
        this.endShift = endShift;
    }

    public long berechneDauerInMillisekunden() {
        long dauerInSekunden = startShift.until(endShift, ChronoUnit.SECONDS);
        long dauerInMillisekunden = dauerInSekunden * 1000;

        return dauerInMillisekunden;
    }
}