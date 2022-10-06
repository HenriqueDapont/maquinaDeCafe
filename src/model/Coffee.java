package model;

import constants.MenuEnum;

import java.util.Arrays;
import java.util.List;

public class Coffee {

    private static StringBuilder resultText = new StringBuilder();

    public static String calculateChange(double price, double payment) {

        if (payment < price) {
            resultText.append("Dinheiro insuficiente. Devolvendo valor: R$" + String.format("%.2f", payment) + ".\n");
            return resultText.toString();
        } else if (payment == price) {
            resultText.append("Não há troco.\n");
            return resultText.toString();
        } else {
            double change = payment - price;
            boolean hasOneCoin = changeNotes(change);
            changeCoins(hasOneCoin, change);
        }
        return resultText.toString();
    }

    public static boolean changeNotes(double change) {
        List<Integer> notes = Arrays.asList(100, 50, 20, 10, 5, 2);
        String result = "Troco = R$" + String.format("%.2f",change) + "\n";
        int value = (int) change;
        int qtNotes;

        for (int i = 0; value >= 2; i++) {
            qtNotes = value / notes.get(i);
            if (qtNotes != 0) {
                result = result + (qtNotes + " nota(s) de R$" + notes.get(i) + ",00.\n");
                value = value % notes.get(i);
            }
        }
        resultText.append(result + "\n");
        return value == 1;
    }

    public static void changeCoins(boolean hasOneCoin, double change) {
        List<Integer> coins = Arrays.asList(1, 50, 25, 10, 5);

        if(hasOneCoin)
            resultText.append("1 moeda de R$" + coins.get(0) + ",00.\n");

        int changeRemain = (int) Math.round((change - (int) change) * 100);
        int qtCoins;

        for (int i = 1; changeRemain >= 5; i++) {
            qtCoins = changeRemain / coins.get(i);
            if (qtCoins != 0) {
                resultText.append(qtCoins + " moeda(s) de " + coins.get(i) + " centavos.\n");
                changeRemain = changeRemain % coins.get(i);
            }
        }
    }
}
