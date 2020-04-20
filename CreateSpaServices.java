import java.util.Scanner;

public class CreateSpaServices{
    public static void main(String[] args){
        //updated way of getting data

        //declaring variables
        // String service;
        // double price;

        //creating objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        // Scanner keyboard = new Scanner(System.in);

        //going to be getting this info a different way
        // prompts for user
        // System.out.print("Enter Service >> ");
        // service = keyboard.nextLine();
        // System.out.print("Enter price >> ");
        // price = keyboard.nextDouble();

        // //setting firstService
        // firstService.setServiceDescription(service);
        // firstService.setPrice(price);

        // //erasing the enter key hit
        // keyboard.nextLine();

        //commented out to prove there are default values
        // //doing it again for the secondService
        // System.out.print("Enter Service >> ");
        // service = keyboard.nextLine();
        // System.out.print("Enter price >> ");
        // price = keyboard.nextDouble();
    
        // //setting secondService
        // secondService.setServiceDescription(service);
        // secondService.setPrice(price);

        //this is a different way fo doing the getting of information
        firstService = getData(firstService);
        secondService = getData(secondService);
        //displaying the firstService
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        //displaying the secondService
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

    }
    public static SpaService getData(SpaService s) {
        //setting variables
        String service;
        double price;
        Scanner keyboard = new Scanner(System.in);
        //prompting users
        System.out.print("Enter Service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        //assigning service and prices for SpaService
        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}