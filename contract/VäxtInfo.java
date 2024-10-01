package växthotellet.contract;

public enum VäxtInfo {

    PALM (0.5, "liter", "mineralvatten"),
    KAKTUS (2, "centiliter", "vatten"),
    KÖTTÄTANDE (0.2, "liter", "proteindryck");

    public final double volumeAmount;
    public final String volumeUnit;
    public final String nutrientType;

    VäxtInfo(double volumeAmount, String volumeUnit, String nutrientType) {
        this.volumeAmount = volumeAmount;
        this.volumeUnit = volumeUnit;
        this.nutrientType = nutrientType;
    }
}
