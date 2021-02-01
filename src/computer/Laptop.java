package computer;

public class Laptop extends Computer {

    private int baterryLevel;


    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.baterryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (baterryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low");
        }
    }


    public void setBatteryLevel(int newBatteryLevel) {
        baterryLevel = newBatteryLevel;
    }
}
