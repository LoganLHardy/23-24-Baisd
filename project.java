import java.util.Scanner;

public class Project {
    public static void main (String[] args) {
        
    Scanner keyboard = new Scanner(System.in);

    Astronaut[] astronauts;
    Spacecraft[] spacecraft;
        
    Astronaut astro = new Astronaut();
    Spacecraft craft = new Spacecraft();
    
    /*astro.setBirthdate("01012001");
    01/01/2001 */


 UserDatabase.createNewUser("username", "password");

        boolean isValid = UserDatabase.verifyUser("username", "password");
        System.out.println("Is valid login? " + isValid);
    }
}