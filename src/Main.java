import constants.MenuEnum;
import model.Coffee;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        List<MenuEnum> menu = Arrays.asList(
                MenuEnum.AMERICAN_COFFEE,
                MenuEnum.CAPPUCCINO,
                MenuEnum.MOCACCINO,
                MenuEnum.VANILLA,
                MenuEnum.HOT_CHOCOLAT
        );
        do {
            System.out.println("Escolha a opção de café: \n");
            menu.stream().forEach(e -> System.out.println(e.getOption() + " - " + e.getName() + ": R$" + e.getValue()));
            option = scan.nextInt();
            if(option > 0 && option <= menu.size()) {
                System.out.println("Insira o valor");
                double payment = scan.nextDouble();
                MenuEnum optionSelected = menu.get(option-1);
                System.out.println(Coffee.calculateChange(optionSelected.getValue(), payment));

            } else {
                System.out.println("Opção inválida");
            }
        } while (1 == 1);
    }
}
