public class Bug implements ConsoleNotification {


    private String bugDescription;

    private int bugPriority;
    private boolean bugStatus;
    private BugReporter bugReporter;


    public Bug(String bugDescription, int bugPriority, BugReporter bugReporter) {
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
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status has just been changed");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter=" + bugReporter +
                '}';
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }
}

