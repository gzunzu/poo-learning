package ingredient;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AlcoholicBeverage implements Ingredient {
    ABSINTHE(false, false),
    BEER(false, true),
    BRANDY(true, false),
    COGNAC(true, false),
    GIN(false, false),
    RUM(true, false),
    SAKE(false, false),
    TEQUILA(false, false),
    VERMOUTH(true, false),
    VODKA(false, false),
    WHISKEY(true, false),
    WINE(true, false);

    private static final float BASE_PRICE = 0.3f;

    private static final String MEASUREMENT_UNIT = "ml";

    private final boolean hasSugar;

    private final boolean hasGluten;

    @Override
    public String getName() {
        return this.name().toLowerCase().replace("_", " ");
    }

    @Override
    public boolean hasAddedSugar() {
        return this.hasSugar;
    }

    @Override
    public boolean hasGluten() {
        return this.hasGluten;
    }

    @Override
    public float getCostPerUnit() {
        return BASE_PRICE;
    }

    @Override
    public String getMeasurementUnit() {
        return MEASUREMENT_UNIT;
    }

    @Override
    public boolean isVegan() {
        return true;
    }
}