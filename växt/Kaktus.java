package växthotellet.växt;

import växthotellet.contract.VäxtInfo;

public class Kaktus extends Växt {

    public Kaktus(String name, double height) {
        super(name, height, VäxtInfo.KAKTUS);
    }

    @Override
    public String toString() {
        return "Kaktusen " + name;
    }
}
