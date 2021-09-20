import java.util.Scanner;
public class ASSIGNMENT3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want an indoor or outdoor club?: ");
        String club = sc.next();
        if(!club.equalsIgnoreCase("Indoor") && !club.equalsIgnoreCase("Outdoor")){
            System.out.println("Sorry, that's not a valid option.");
            return;
        }
        System.out.print("How much are you willing to pay in dues?: ");
        double dues = sc.nextDouble();


        if(club.equalsIgnoreCase("Indoor") && dues<=5){
            System.out.println("You could join the Chess club!");
        }else if(club.equalsIgnoreCase("Indoor") && dues>=10){
            System.out.println("You could join the Virtual Reality club!");
        }else if(club.equalsIgnoreCase("Outdoor") && dues<=5){
            System.out.println("You could join the Running club!");
        }else if(club.equalsIgnoreCase("Outdoor") && dues>=10){
            System.out.println("You could join the Medieval Combat Sports club!");
        }
    }
}
