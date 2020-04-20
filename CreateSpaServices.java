import java.util.Scanner;

public class CreateSpaServices{
    public static void main(String[] args){
        //declaring variables
        String service;
        double price;

        //creating objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);

        //prompts for user
        System.out.print("Enter Service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        //setting firstService
        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        //erasing the enter key hit
        keyboard.nextLine();

        //doing it again for the secondService
        System.out.print("Enter Service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
    
        //setting secondService
        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        //displaying the firstService
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        //displaying the secondService
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

    }
}