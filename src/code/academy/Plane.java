package code.academy;

import code.academy.exceptions.ChassisLoweringException;
import code.academy.exceptions.FatalError;
import code.academy.exceptions.Warning;

import java.util.Random;

public class Plane {

    public void lowerChassis() {
        try {
            chassis();
            System.out.println("OK: chassis lowered successfully");
        } catch (ChassisLoweringException e) {
            System.out.println("ERROR: failed to lower chassis" + e.getReason());
        }
    }

    public void chassis() throws ChassisLoweringException {
        int randomInt = new Random().nextInt(10);

        switch (randomInt) {
            case 0: throw new Warning("Hydraulic leak");
            case 1: throw new FatalError("Door jam");
            case 2: throw new Warning("Low pressure");
        }
    }
}
