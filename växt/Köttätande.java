package växthotellet.växt;

import växthotellet.contract.VäxtInfo;

public class Köttätande extends Växt {

    private static final double NUTRITION_BASE_AMOUNT = 0.1;

    protected static double getNutritionBaseAmount() {
        return NUTRITION_BASE_AMOUNT;
    }

    public Köttätande(String name, double height) {
        super(name, height, VäxtInfo.KÖTTÄTANDE);
    }

    @Override
    public String toString() {
        return "Köttätande växten " + name;
    }
}
