import java.io.FileInputStream;
import java.util.*;
import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("test2");

        LocalDate one = LocalDate.of(2023, 10, 3);
        LocalDate two = LocalDate.of(2023, 12, 3);
        LocalDate three = LocalDate.of(2023, 11, 3);

        Event event1 = new Event("Assignment 1", "CPSC 210", one);
        Event event2 = new Event("Assignment 2", "CPSC 210", two);
        Event event3 = new Event("Assignment 3", "CPSC 210", three);

        Queue<Event> queue = new PriorityQueue<>(1, new SortbyDate());
        queue.add(event1);
        queue.add(event2);
        queue.add(event3);

        System.out.println(queue.remove().getName());
        System.out.println(queue.remove().getName());
        System.out.println(queue.remove().getName());

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

    }
}
