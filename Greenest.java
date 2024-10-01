package växthotellet;

import växthotellet.växt.*;

import java.util.ArrayList;

public class Greenest {

    public void run() {
        //inkapsling ?
        Växt igge = new Kaktus("Igge", 0.2);
        Växt laura = new Palm("Laura", 5);
        Växt meatloaf = new Köttätande("Meatloaf", 0.7);
        Växt olof = new Palm("Olof", 1);

        ArrayList<Växt> växter = new ArrayList<>();
        växter.add(igge);
        växter.add(laura);
        växter.add(meatloaf);
        växter.add(olof);

        new GreenestGUI(växter);
    }
}
