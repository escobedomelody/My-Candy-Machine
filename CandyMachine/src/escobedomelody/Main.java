package escobedomelody;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

   //Method to Display item choices
    public static double displayChoices() {
        double price = -1;
        System.out.println("Well here's what I have.");
        System.out.println("A.      Php 5.00     Sweet Butter Cup");
        System.out.println("B.      Php 15.00    Banana Crispy Chips");
        System.out.println("C.      Php 10.00     Fruity Gums");
        System.out.println("D.      Php 25.00    Red Fluffy Cookies");

        System.out.println();
        System.out.println("Which candy do you like: (letter)?");
        String choice = keyboard.next().toUpperCase();

        if(choice.equals("A")) {
            price = 5.00;
            return 5.00;
        } else if (choice.equals("B")) {
            price = 15.00;
            return 15.00;
        } else if (choice.equals("C")) {
            price = 10.00;
            return 10.00;
        } else if (choice.equals("D")) {
            price = 25.00;
            return 25.00;
        }
        return price;
    }

    //Method to Dispense Candy and Return change
    public static void dispense(double moneyInserted, double candyCost){
        if(moneyInserted > candyCost){
            System.out.println("Vending...");
            System.out.println("Here's your candy!");
            double change = (double) moneyInserted - (double) candyCost;
            System.out.println("Here's your Php " + change + " in change.");
            System.out.println("Please comeback again :)");
        }
        else{
            System.out.println("Sorry mate, you're too broke. Here's your Php."+ moneyInserted +"Back. Thank you.");
        }
    }



    public static void main(String[] args) {
        //Welcome Statement To Vending Machine
        System.out.println("Welcome To Melody's Candy Machine!!!");
        System.out.println("I got the sweetest and delicious candy ;)");

        //Prompt & Store for User Information
        System.out.print("How much money do you have?");
        double moneyInserted = keyboard.nextDouble();

        //return type of the method was double,so have to store it
      double candyCost = displayChoices();

      //return type was void so don't have to store it
        dispense(moneyInserted,candyCost);

    }
}
