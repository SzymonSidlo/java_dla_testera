package computer;

import java.util.Objects;

public class PC extends Computer {
    //    private boolean powerConnection;
    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram);
//        powerConnection = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        return volumeLevel += 1;
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
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }
//    @Override
//    public void switchOn() {
//        System.out.println("Checking power connection");
//        if (powerConnection) {
//            super.switchOn();
//        } else {
//            System.out.println("Power connection failed, please connect to power supply");
//        }

//    @Override
//    public void switchOff() {
//        System.out.println("Wyłączam PCta " + name);
//        state = false;
//    }
//    public void setPowerConnection(boolean newPowerConnection) {
//        powerConnection = newPowerConnection;
//    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}