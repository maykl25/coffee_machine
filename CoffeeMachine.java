
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;
    static String option;

    /**
     method info() provides information about supplies of coffee machine and about earned money.
     **/

    public static void info(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:" + '\n' + water + " of water" + '\n' + milk + " of milk" +
                '\n' + beans + " of coffee beans" + '\n' + cups + " of disposable cups" + '\n' + money + " of money");
    }

    /**
     * method buy() allows to choose coffee type and buy it.
     */

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String number = scanner.nextLine();

        switch (number) {
            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    water = water - 250;
                    coffeeBeans = coffeeBeans - 16;
                    money = money + 4;
                    cups = cups - 1;
                    System.out.println("I have enough resources, making coffee!");
                    System.out.println();
                }
                break;

            case "2":
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans < 20){
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                else {
                    water = water - 350;
                    milk = milk - 75;
                    coffeeBeans = coffeeBeans - 20;
                    money = money + 7;
                    cups = cups - 1;
                    System.out.println("I have enough resources, making coffee!");
                    System.out.println();
                }
                break;

            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans < 12){
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");

                }
                else {
                    water = water - 200;
                    milk = milk - 100;
                    coffeeBeans = coffeeBeans - 12;
                    money = money + 6;
                    cups = cups - 1;
                    System.out.println("I have enough resources, making coffee!");
                    System.out.println();
                }
                break;

            case "back":
                break;
        }
    }

    /*
     * method fill() allows to add some supplies to the Machine.
     */

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        water = water + addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        milk = milk + addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addBeans = scanner.nextInt();
        coffeeBeans = coffeeBeans + addBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scanner.nextInt();
        cups = cups + addCups;
        System.out.println();
    }

    /**
     * method take() allows to take all income out of Machine.
     */

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

    /**
     * method remaining() provides info about supplies and money after an action with Machine.
     */

    public static void remaining() {
        info(water, milk, coffeeBeans, cups, money);
        System.out.println();
    }

    /**
     * method action() provides an action menu for interaction with Machine.
     */

    public static void action(String request) {
        switch (request) {
            case "buy":
                buy();
                break;

            case "fill":
                fill();
                break;

            case "take":
                take();
                break;

            case "remaining":
                remaining();
                break;
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            option = scanner.nextLine();
            action(option);
        } while(!option.equals("exit"));
    }
}