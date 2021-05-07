package computer;

import java.util.Objects;

public class Laptop extends Computer {
    private int baterryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.baterryLevel = batteryLevel;
    }

//    @Override
//    public void switchOn() {
//        System.out.println("Checking battery level");
//        if (baterryLevel > 0) {
//            super.switchOn();
//        } else {
//            System.out.println("Battery level to low");
//        }
//    }

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

//    @Override
//    public void switchOff() {
//        System.out.println("Wyłączam Laptopa " + name);
//        state = false;
//    }

    public void metodaKlasyLaptop() {
        System.out.println("To jest wypasiona metoda dedykowana tylko dla klasy Laptop");
    }

    public void setBatteryLevel(int newBatteryLevel) {
        baterryLevel = newBatteryLevel;
    }

//    @Override
//    public void playMusic() {
//        System.out.println("PLAY MUSIC");
//    }
//
//    @Override
//    public void pauseMusic() {
//        System.out.println("PAUSE MUSIC");
//    }
//
//    @Override
//    public void stopMusic() {
//        System.out.println("STOP MUSIC");
//    }
//
//    @Override
//    public void sayHello() {
//        Music.super.sayHello();
//    }

//    @Override
//    public void playVideo() {
//        System.out.println("PLAY VIDEO");
//    }
//
//    @Override
//    public void pauseVideo() {
//        System.out.println("PAUSE VIDEO");
//    }
//
//    @Override
//    public void stopVideo() {
//        System.out.println("STOP VIDEO");
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                " name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", baterryLevel=" + baterryLevel +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Laptop laptop = (Laptop) o;
//        return baterryLevel == laptop.baterryLevel;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), baterryLevel);
//    }
}
