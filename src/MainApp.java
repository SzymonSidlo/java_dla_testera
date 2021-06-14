import enums.Gender;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MainApp {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Szymon", "Sidło", "szymon@test.pl", 35, Gender.MALE));
        users.add(new User("Alojzy", "Testowy", "alojzy@test.pl", 45, Gender.MALE));
        users.add(new User("Eliza", "Awaryjna", "eliza@test.pl", 27, Gender.FEMALE));
        users.add(new User("Alicja", "Obłędna", "alicja@test.pl", 32, Gender.FEMALE));
        users.add(new User("Stefan", "Defekt", "stefan@test.pl", 38, Gender.MALE));
        users.add(new User("Magda", "Testowa", "magda@test.pl", 33, Gender.FEMALE));

        users.stream()
                .filter(s -> s.getGender().equals(Gender.FEMALE))
                .forEach(s -> System.out.println(s));

        // Wczytanie imion z pliku do listy:

        List<String> names = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                names.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);

        // Rzucenie wyjątku "IllegalStateException"

//        names.stream()
//                .filter(s -> s.startsWith("B"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Takie imię nie istnieje na liście"));

        // Rzucenie swojego wyjątku "IllegalBugPriorityException"

        Bug bug1 = new Bug("testowy", 3, new BugReporter("Szymon", "Sidlo",
                "mail@wp.pl"));

        System.out.println(bug1.getBugPriority());
        bug1.setBugPriority(8);
        System.out.println(bug1.getBugPriority());


    }
}
