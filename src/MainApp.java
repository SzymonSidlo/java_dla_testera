import Model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug szymon_4 = new Bug("GrubyBlad1", "testowy@wp.pl", 3, true);


        // walidacja Bug Description

        System.out.println(szymon_4.getBugDescription());

        szymon_4.setBugDescription("Blad");

        System.out.println(szymon_4.getBugDescription());

        // Walidacja Email

        System.out.println(szymon_4.getEmail());

        szymon_4.setEmail("typowy_mail");

        System.out.println(szymon_4.getEmail());

        // Walidacja Bug Priority

        System.out.println(szymon_4.getBugPriority());

        szymon_4.setBugPriority(6);

        System.out.println(szymon_4.getBugPriority());

    }
}
