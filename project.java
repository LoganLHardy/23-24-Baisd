import java.util.Scanner;

public class Project {
    public static void main (String[] args) {
        
    Scanner keyboard = new Scanner(System.in);

    Astronaut[] astronauts;
    Spacecraft[] spacecraft;
        
    Astronaut astro = new Astronaut();
    Spacecraft craft = new Spacecraft();

    while(!menuChoice == 5) {
        System.out.println("Welcome to the universal space program");
        System.out.println("Write down this password");
        System.out.println(password);
        System.out.println("Enter your password");
        input = keyboard.nextLine();
        System.out.println("Please select one of these options");
        System.out.println("1. Access astronaut information");
        System.out.println("2. Add or Remove an astronaut");
        System.out.println("3. Edit astronaut information");
        System.out.println("4. Start launch process");
        System.out.println("5. Exit the program");
        menuChoice = keyboard.nextInt();

    }

    if(menuChoice == 1) {
        while(!choice == 11) {
            System.out.println("Please choose which information you want to see");
            System.out.println("1. Astronaut name");
            System.out.println("2. Date of birth");
            System.out.println("3. Serial number");
            System.out.println("4. Physical address");
            System.out.println("5. Email address");
            System.out.println("6. Phone number");
            System.out.println("7. Pay rate");
            System.out.println("8. Weight");
            System.out.println("9. Next of kin");
            System.out.println("10. Status");
            System.out.println("11. Return to main menu");
            choice = keyboard.nextInt();
        }
    }

    if(menuChoice == 2) {
        while(!choice == 3) {
            System.out.println("Please choose whether you want to add or remove an astronaut");
            System.out.println("1. Add a new astronaut");
            System.out.println("2. Remove an existing astronaut");
            System.out.println("3. Return to main menu");
            choice = keyboard.nextInt();
        }
    }

    if(menuChoice == 3) {
        while(!choice == 11) {
            System.out.println("Please choose which information you want to edit");
            System.out.println("1. Astronaut name");
            System.out.println("2. Date of birth");
            System.out.println("3. Serial number");
            System.out.println("4. Physical address");
            System.out.println("5. Email address");
            System.out.println("6. Phone number");
            System.out.println("7. Pay rate");
            System.out.println("8. Weight");
            System.out.println("9. Next of kin");
            System.out.println("10. Status");
            System.out.println("11. Return to main menu");
            choice = keyboard.nextInt();
        }
    }

    if(menuChoice == 4) {
        while(!choice == 2) {
            System.out.println("Would you like to begin the launch sequence?");
            System.out.println("1. Yes");
            System.out.println("2. No, return to main menu");
            choice = keyboard.nextInt();
        }
    }

    if(menuChoice == 5) {
        System.out.println("Are you sure you would like to log out and exit?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        choice == keyboard.nextInt();
            if(choice == 1) {
                System.out.println("Thank you for being a part of the universal space program and have a nice day!");
                System.exit(0);
            }
    }

    astro.name = 
    astro.birthdate = 
    astro.serial = 
    astro.address = 
    astro.email = 
    astro.phone = 
    astro.payrate = 
    astro.weight = 
    astro.nextkin = 
    astro.status = 
    
    /*astro.setBirthdate("01012001");
    01/01/2001 */

    }
}