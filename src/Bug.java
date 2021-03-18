import java.util.Objects;

public class Bug implements Comparable<Bug> {


    private String bugDescription;

    private int bugPriority;
    private boolean bugStatus;
    private String bugReporter;


    public Bug(String bugDescription, int bugPriority, String bugReporter) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        //this.bugStatus = bugStatus;
    }


    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() >= 10) {
            this.bugDescription = bugDescription;
        } else {
            System.out.println("Bug description must have minimum 10 characters");
        }
    }


    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Bug Priority must be in range 1-5");
            }
        }
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
//        notifyStatusChange();
        this.bugStatus = bugStatus;
    }

//    @Override
//    public void notifyStatusChange() {
//        System.out.println("Bug status has just been changed");
//    }


    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter='" + bugReporter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority &&
                bugStatus == bug.bugStatus &&
                Objects.equals(bugDescription, bug.bugDescription) &&
                Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugPriority, bugStatus, bugReporter);
    }

    public String getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(String bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getBugDescription().compareTo(bug.getBugDescription());
        return compareResult;
    }
}

