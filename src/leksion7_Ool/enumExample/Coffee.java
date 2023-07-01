package leksion7_Ool.enumExample;

public enum Coffee {
    LATTE(1),
    ESPRESSO(2),
    AMERICANO (3);

    public int getValue() {
        return value;
    }

    private final int value;
    Coffee(int value) {
        this.value=value;
    }



}
