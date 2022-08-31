package model;

import java.util.Arrays;
import java.util.List;

public class Coffee {

    private String name;
    private double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String calculateChange(Coffee coffee, double money) {
        List<Integer> notes = Arrays.asList(100, 50, 20, 10, 5, 2);
        List<Integer> coins = Arrays.asList(1, 50, 25, 10, 5);
        double price = coffee.getPrice();
        double change;
        int value, qtNotes, qtCoins, changeRemain;
        String result;

        if (money < price) {
            result = "Dinheiro insuficiente. Devolvendo valor: R$" + String.format("%.2f", money) + ".\n";
            return result;
        } else if (money == price) {
            result = "Não há troco.\n";
            return  result;
        } else {
            change = money - price;
            result = "Troco = R$" + String.format("%.2f",change) + "\n";
            value = (int) change;

            for (int i = 0; value != 0 && value != 1; i++) {
                qtNotes = value / notes.get(i);
                if (qtNotes != 0) {
                    result = result + (qtNotes + " nota(s) de R$" + notes.get(i) + ",00.\n");
                    value = value % notes.get(i);
                }
            }
            result = result + "\n";

            if(value == 1)
                result = result + ("1 moeda de R$" + coins.get(0) + ",00.\n");

            changeRemain = (int) Math.round((change - (int) change) * 100);

            for (int i = 1; changeRemain != 0 && changeRemain >= 5; i++) {
                qtCoins = changeRemain / coins.get(i);
                if (qtCoins != 0) {
                    result = result + (qtCoins + " moeda(s) de " + coins.get(i) + " centavos.\n");
                    changeRemain = changeRemain % coins.get(i);
                }
            }
        }
        return result;
    }
}
