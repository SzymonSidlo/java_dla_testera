import computer.PC;
import computer.Laptop;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);

//        gamingLaptop.setBatteryLevel(0);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getState());

        // Test 1 : próba gdy PC jest podłączony do prądu

//        officeComputer.switchOn();
//        System.out.println(officeComputer.getState());

        // Test 2 :  próba gdy PC jest odłączony od prądu

        officeComputer.setPowerConnection(false);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

    }
}
