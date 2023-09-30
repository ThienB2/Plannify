import java.time.LocalDate;

public class Event {

    private String name;
    private String subject;
    private boolean isCompleted;
    private LocalDate deadline;

    // Contructor for the event class.
    // Uses the name, subject, and time parameter to make a event object with isCompleted = false
    public Event(String name, String subject, LocalDate time) {
        this.name = name;
        this.subject = subject;
        this.deadline = time;
        isCompleted = false;
    }

    // Getters & Setters
    public String getName() { return name; }
    public String getSubject() { return subject; }
    public LocalDate getDeadline() { return deadline; }
    public boolean getStatus() { return isCompleted; }

    public void setComplete() { isCompleted = true; }


    
}
