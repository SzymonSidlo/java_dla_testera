package Model;

public class Bug {
    // 1.POLA OBIEKTU
    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean bugStatus;


    // 2. Konstruktor

    public Bug(String bugDescription, String email, int bugPriority, boolean bugStatus) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;
    }

    // 3. METODY (dawne)

//    public void showAllBugInfo() {
//        System.out.println(" Bug description " + bugDescription + " Email " + email + " Bug priority " + bugPriority
//                + " Bug Status " + bugStatus);
//    }
//
//    public void showPersonEmail() {
//        System.out.println("Email" + email);
//    }
//
//    public void showBugStatus() {
//        System.out.println("Bug Status " + bugStatus);
//    }
//
//    public int getBugPriority() {
//        return bugPriority;
//    }

    // Gettery i Settery


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email must contains @");
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
        this.bugStatus = bugStatus;
    }
}
