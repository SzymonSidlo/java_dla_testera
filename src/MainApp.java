

public class MainApp {
    public static void main(String[] args) {

        BugReporter bugReporter = new BugReporter("Szymon", "Sidło", "raporty@gmail.com");
        Bug bug1 = new Bug("Wrong data source", 3, bugReporter);

        System.out.println(bug1);

//        // WALIDACJA E-MAIL
        System.out.println(bugReporter.getEmail());
        bugReporter.setEmail("Mail_bez_malpy_wp.pl");
        System.out.println(bugReporter.getEmail());

//        // WALIDACJA METODY Z INTERFEJSU
        bug1.setBugStatus(true);
        System.out.println(bug1.isBugStatus());
        bug1.setBugStatus(false);
        System.out.println(bug1.isBugStatus());

    }
}