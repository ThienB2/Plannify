import java.util.*;

public class Calendar {
    private Queue<Event> events;
    
    // Constructor: create calendar object with empty set of events
    public Calendar() { events = new PriorityQueue<>(); }
    
    // AddEvent function to add new events to list
    public void addEventList(List<Event> list) {
        for (Event event : list) {
            if (!events.contains(event)) {
                events.add(event);
            }
        }
    }

    public void completeEvent(Event event) {
        event.setComplete();
        events.remove(event);
    }

    

}