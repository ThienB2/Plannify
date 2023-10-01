import java.time.LocalDate;
import java.util.Comparator;

public class Event {

    private String name;
    private String subject;
    private boolean isCompleted;
    public LocalDate deadline;

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

class SortbyDate implements Comparator<Event> {
    // Method
    // Sorting in ascending order of date
    public int compare(Event a, Event b) {
        return a.getDeadline().compareTo(b.getDeadline());
    }
}