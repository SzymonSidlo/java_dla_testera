import computer.PC;
import computer.Computer;
import computer.Laptop;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer = new PC("Office computer", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);

        officeComputer.volumeUp();

        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeUp(50);
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeUp(50);
        System.out.println(officeComputer.getVolumeLevel());

        officeComputer.volumeDown(10);
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeDown(100);
        System.out.println(officeComputer.getVolumeLevel());

    }
}