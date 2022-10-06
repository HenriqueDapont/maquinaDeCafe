package constants;

public enum MenuEnum {

    AMERICAN_COFFEE(1, "Café Americano", 3.00),
    CAPPUCCINO(2, "Cappuccino", 4.50),
    MOCACCINO(3, "Moccaccino", 4.00),
    VANILLA(4, "Vanilla", 4.80),
    HOT_CHOCOLAT(5, "Chocolate Quente", 6.00);

    MenuEnum(int option, String name, double value) {
        this.option = option;
        this.name = name;
        this.value = value;
    }

    private int option;
    private String name;
    private double value;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getOption() {
        return option;
    }
}
