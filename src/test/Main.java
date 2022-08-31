package test;

import model.Coffee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        double money;
        do {
            System.out.println("Escolha a opção de café: ");
            System.out.println(" ");
            System.out.println("1 - Café Americano: R$3,00");
            System.out.println("2 - Cappuccino: R$4,50");
            System.out.println("3 - Mocaccino: R$4,00");
            System.out.println("4 - Vanilla: R$4,80");
            System.out.println("5 - Chocolate Quente: R$6,00");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    Coffee americano = new Coffee("Café Americano", 3.00);
                    System.out.println("Pedido: " + americano.getName() + "\nInsira o dinheiro: ");
                    money = scan.nextDouble();
                    Coffee.calculateChange(americano, money);
                    System.out.println(Coffee.calculateChange(americano, money));
                    break;
                case 2:
                    Coffee cappuccino = new Coffee("Cappuccino", 4.50);
                    System.out.println("Pedido: " + cappuccino.getName() + "\nInsira o dinheiro: ");
                    money = scan.nextDouble();
                    Coffee.calculateChange(cappuccino, money);
                    System.out.println(Coffee.calculateChange(cappuccino, money));
                    break;
                case 3:
                    Coffee moccaccino = new Coffee("Moccaccino", 4.00);
                    System.out.println("Pedido: " + moccaccino.getName() + "\nInsira o dinheiro:");
                    money = scan.nextDouble();
                    Coffee.calculateChange(moccaccino, money);
                    System.out.println(Coffee.calculateChange(moccaccino, money));
                    break;
                case 4:
                    Coffee vanilla = new Coffee("Vanilla", 4.80);
                    System.out.println("Pedido: " + vanilla.getName() + "\nInsira o dinheiro:");
                    money = scan.nextDouble();
                    Coffee.calculateChange(vanilla, money);
                    System.out.println(Coffee.calculateChange(vanilla, money));
                    break;
                case 5:
                    Coffee chocolateQuente = new Coffee("Chocolate Quente", 6.00);
                    System.out.println("Pedido: " + chocolateQuente.getName() + "\nInsira o dinheiro:");
                    money = scan.nextDouble();
                    Coffee.calculateChange(chocolateQuente, money);
                    System.out.println(Coffee.calculateChange(chocolateQuente, money));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (1 == 1);
    }
}
