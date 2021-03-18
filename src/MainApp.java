import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        // Pkt 1 : Lista bugów
        Set<Bug> bugs = new HashSet<>();

        bugs.add(new Bug("Font_Size_Error", 2, "Reporter1"));
        bugs.add(new Bug("Database_Connection_Failure", 4, "Reporter2"));
        bugs.add(new Bug("Access_Error", 3, "Reporter3"));
        bugs.add(new Bug("Duplicated_Test_Bug_1", 1, "Reporter4"));
        bugs.add(new Bug("Duplicated_Test_Bug_1", 1, "Reporter4"));
        bugs.add(new Bug("Duplicated_Test_Bug_2", 2, "Reporter5"));
        bugs.add(new Bug("Duplicated_Test_Bug_2", 2, "Reporter5"));

        // Walidacja ilości unikalnych bugów
        System.out.println(bugs.size());

        // Pkt 2 :  Wyciągnięcie z listy unikalnych wartości:
        for (Bug bug : bugs) {
            System.out.println(" Bug Description: " + bug.getBugDescription() + " ; " + " Bug priority = "
                    + bug.getBugPriority() + " ; " + " Bug reporter: " + bug.getBugReporter());
        }

        // Pkt 3 : Sortowanie po Bug Description:
        Set<Bug> sortedBugs = new TreeSet<>(bugs);

        for (Bug bug : sortedBugs) {
            System.out.println(" Sorted Bug Description: " + bug.getBugDescription() + " ; " + " Bug Priority = "
                    + bug.getBugPriority() + " ;" + "Bug Reporter: " + bug.getBugReporter());
        }

    }
}