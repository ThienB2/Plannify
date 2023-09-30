import java.time.LocalDate;

public class Event {
    private String name;
    private String subject;
    private boolean isCompleted;
    private LocalDate deadline;

    public Event(String name, String subject, LocalDate time) {
        this.name = name;
        this.subject = subject;
        this.deadline = time;
        isCompleted = false;
    }
}
