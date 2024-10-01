package växthotellet.växt;

import växthotellet.contract.VäxtInfo;

public class Palm extends Växt {

    public Palm(String name, double height) {
        super(name, height, VäxtInfo.PALM);
    }

    @Override
    public String toString() {
        return "Palmen " + name; //polymorfism, se: Palm och Kaktus
    }
}
