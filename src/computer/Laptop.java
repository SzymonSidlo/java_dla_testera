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

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam Laptopa " + name);
        state = false;
    }

    public void metodaKlasyLaptop() {
        System.out.println("To jest wypasiona metoda dedykowana tylko dla klasy Laptop");
    }


    public void setBatteryLevel(int newBatteryLevel) {
        baterryLevel = newBatteryLevel;
    }
}