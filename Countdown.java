import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Countdown {
    int seconds1 = 10;
    int seconds2 = 300;

    Scanner keyboard = new Scanner();
    Countdown timer = new Countdown();
    Countdown eva = new Countdown();
    Menu menu = new Menu();
    menu.startTimer();

    public void startTimer() {

        System.out.println("Press enter to start the launch countdown");
        keyboard.nextLine();

    timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
                if (seconds1 > 0) {
                    System.out.println("Launching in: " + seconds1);
                    seconds1--;
                } else {
                    System.out.println("Rocket has launched!");
                    timer.cancel();
                }
            }

    }, 0, 1000, );


    eva.scheduleAtFixedRate(new TimerTask() {
        public void run() {
                if (seconds2 > 0) {
                    System.out.println("Astronauts EVA time left: " + seconds2);
                    seconds2--;
                } else {
                    System.out.println("Astronauts EVA has ended");
                    timer.cancel();
                }
            }

    }, 5000, 1000, );

    }

}