import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  


public class Scraper { 

    public List<Event> returnEvents(String fileName) throws Exception{
         File fis = new File(fileName);
        Scanner sc = new Scanner(fis);
        List<Event> listOfEvents = new ArrayList<Event>(); 

            while (sc.hasNextLine()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            String name = sc.nextLine(); 
            String subject = sc.nextLine(); 
            LocalDate time = LocalDate.parse(sc.nextLine(), formatter);
            Event event = new Event(name, subject, time); 
            listOfEvents.add(event); 
        }
        sc.close();
        return listOfEvents; 
    }





    

}
