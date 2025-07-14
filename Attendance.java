
import java.time.LocalDate;

public class Attendance {
    private String rollNo;
    private LocalDate date;
    private boolean present;

    public Attendance(String rollNo, LocalDate date, boolean present) {
        this.rollNo = rollNo;
        this.date = date;
        this.present = present;
    }

    public String getRollNo() {
        return rollNo;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }
}
