public class MainApp {

    public static void main(String[] args) {

        Bug szymon_3 = new Bug("BladNr1", "oblednyMail@wp.pl", 3, true);

        szymon_3.getAllBugInfo();

        int bugPriority = szymon_3.getBugPriority();
        System.out.println(bugPriority);

        szymon_3.getPersonEmail();

        szymon_3.getBugStatus();
    }
}
