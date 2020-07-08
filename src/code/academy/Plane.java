package code.academy;

import java.util.Random;

public class Plane {

    public void lowerChasis() {
        int randomNumber = new Random().nextInt(10);
        int i = 4 / randomNumber;
        System.out.println("OK: chasis lowered successfully");
    }
}
