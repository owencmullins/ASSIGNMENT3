import java.util.*;
public class ASSIGNMENT3A {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String option;
        int dolls;
        double cost=2;

        System.out.println("Welcome to the KSU Bookstore!");
        System.out.print("Do you want to purchase Scrappy dolls?:");
        option=input.nextLine();

        if(option.equals("No"))
            System.out.println("Have a nice day!");
        else if(option.equals("Yes"))
        {
            System.out.print("How many Scrappy dolls do you want to buy?:");
            dolls=input.nextInt();
            if(dolls==0)
                System.out.println("Have a nice day!");
            else if(dolls>5)
            {
                double discount;
                discount=(dolls*cost)-(dolls*cost*0.1);
                System.out.println("You earned a 10% discount for buying in bulk!");
                System.out.format(dolls+" Scrappy dolls cost $%.2f. Thank you!",discount);
                System.out.println("\nHave a nice day!");
            }
            else if(dolls<=5)
            {
                System.out.format(dolls+" Scrappy dolls cost $%.2f. Thank you!",(dolls*cost));
                System.out.println("\nHave a nice day!");
            }
        }
    }
}
