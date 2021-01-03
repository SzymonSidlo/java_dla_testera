public class Bug {

        // 1.POLA OBIEKTU
        String bugDescription;
        String email;
        int bugPriority;
        boolean bugStatus;

        // 2. Konstruktor

        Bug(String bugDescription, String email, int bugPriority, boolean bugStatus){
            this.bugDescription = bugDescription;
            this.email = email;
            this.bugPriority = bugPriority;
            this.bugStatus = bugStatus;
        }

        // 3. METODY

        void getAllBugInfo () {
            System.out.println(" Bug description " + bugDescription + " Email " + email + " Bug priority " + bugPriority
                    + " Bug Status " + bugStatus);
        }

        void getPersonEmail () {
            System.out.println("Email" + email);
        }

        void getBugStatus () {
            System.out.println("Bug Status " + bugStatus);
        }

        int getBugPriority () {
            return bugPriority;
        }
}
