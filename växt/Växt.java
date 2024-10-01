package växthotellet.växt;

import växthotellet.contract.StringRepresentable;
import växthotellet.contract.VäxtInfo;
import växthotellet.contract.WaterAmountable;

public abstract class Växt implements StringRepresentable, WaterAmountable {

    //inkapsling
    private final VäxtInfo växtTyp;
    private double height;
    protected String name;

    protected Växt(String name, double height, VäxtInfo växtTyp) {
        this.name = name;
        this.height = setHeight(height);
        this.växtTyp = växtTyp;
    }

    public double setHeight(double height) {
        if (height < 0) {
            return 0;
        }
        else return height;
    }

     public double getWaterAmount() {
        return switch (växtTyp) {
            case PALM -> växtTyp.volumeAmount * height;
            case KAKTUS -> växtTyp.volumeAmount; //OBS: ger svaret i centiliter
            case KÖTTÄTANDE -> Köttätande.getNutritionBaseAmount() + (växtTyp.volumeAmount * this.height);
            default -> Double.NaN;
        };
    }

    @Override
    public String getDetails() {
        return name + " behöver " + getWaterAmount() + " " + växtTyp.volumeUnit + " " + växtTyp.nutrientType;
    }
}
