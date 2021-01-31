package computer;

public class PC extends Computer {

    private boolean powerConnection;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        powerConnection = true;

    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power connection");
        if (powerConnection) {
            super.switchOn();
        } else {
            System.out.println("Power connection failed, please connect to power supply");
        }
    }

        public void setPowerConnection(boolean newPowerConnection) {
        powerConnection = newPowerConnection;
    }

}
